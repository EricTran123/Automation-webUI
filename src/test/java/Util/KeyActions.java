package Util;
import static Util.WaitElementUntil.waitWebElementPresence;
import static propertyFiles.Constants.Path_BrowserDrivers;
import static propertyFiles.Constants.Path_ConfigurationFile;
import java.util.List;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import Util.KeyBoard;
import Util.Log;

public class KeyActions {
    //声明静态的Webdriver对象，用于在此类中相关Driver的操作
    public static WebDriver driver;
    //声明存储定位表达式配置文件的ObjectMap对象
    private static ObjectMap objectMap = new ObjectMap(Path_ConfigurationFile);
    static {
        //指定log4j配置文件为log4j.xml
        DOMConfigurator.configure("log4j.xml");
        }
    //定义函数initBrowser，并返回驱动
    public static WebDriver initBrowser(String Browser) {
        if(Browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver",Path_BrowserDrivers+"chromedriver.exe");
            driver = new ChromeDriver();
            Log.info("启动Chrome浏览器");
        }else if (Browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver",Path_BrowserDrivers+"IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            Log.info("启动IE浏览器");
        }else {
            System.setProperty("webdriver.gecko.driver", Path_BrowserDrivers+"geckodriver.exe");
            driver = new FirefoxDriver();
            Log.info("启动Firefox浏览器");
        }
        return driver;
    }
    //定义函数navigate，用于获取浏览器要访问的链接
    public static void navigate(String url){
        driver.get(url);
        Log.info("访问地址为"+url);
    }
    //用于显示等待页面元素的出现
    public static void WaitFor_Element(String xpathExpression){
        try{
            waitWebElementPresence(driver, objectMap.getLocator(xpathExpression));
            Log.info("显示等待页面元素出现成功， 页面元素是" + xpathExpression);
        }catch (Exception e){
            Log.info("显示等待页面元素时出现异常，异常信息为：" + e.getMessage());
            e.printStackTrace();
        }
    }
    //通过从剪切板黏贴的方式，在文件上传框体的文件名输入框中输入要上传文件的路径和名称"uploadpathandname"
    public static void paste_uploadFilename(String uploadpathandname){
        try{
            KeyBoard.setAndctrlVClipboardData(uploadpathandname);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //页面上不止一个相同功能并且xpath相同的元素，此种情况处理是将他们存储到List中，然后用索引的方式用其一
    public static void twoWay(String ElementNameInproFile){
        try {
            List<WebElement> elements = driver.findElements(objectMap.getLocator(ElementNameInproFile));
            elements.get(0).click();
            System.out.println("按钮被成功点击");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //用于等待操作，暂停几秒，函数参数以毫秒为单位
    public static void sleep(String sleepTime){
        try{
            WaitElementUntil.sleep(Integer.parseInt(sleepTime));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //断言文字内容
    public static void assert_String(WebDriver driver,String assertstring){
        try{
            Assert.assertTrue(driver.getPageSource().contains(assertstring));
        }catch (AssertionError e){
            System.out.println("断言失败");
        }
    }
    //关闭浏览器
    public static void close_Browser(WebDriver driver){
        try{
            System.out.println("关闭浏览器");
            driver.quit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

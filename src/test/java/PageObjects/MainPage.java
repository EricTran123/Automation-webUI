package PageObjects;

import Util.GetElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static PropertyFiles.Constants.Path_ConfigurationFile;

public class MainPage {
    private WebElement element = null;
    //指定页面元素定位表达式配置文件的绝对路径
    private GetElements getElements = new GetElements(Path_ConfigurationFile);
    private WebDriver driver;
    public MainPage(WebDriver driver){
        this.driver = driver;
    }
    //返回控制台链接页面元素
    public WebElement controller() throws Exception {
        element = driver.findElement(getElements.getLocator("paas.landPage.controller"));
        return element;
    }
    //返回页面右上角个人信息链接页面元素
    public WebElement personalinfo() throws Exception{
        element = driver.findElement(getElements.getLocator("paas.personalinfo.userlink"));
        return element;
    }
}

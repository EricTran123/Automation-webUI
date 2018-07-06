package pageObjects;

import Util.ObjectMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DatabaseManagement {
    private WebElement element = null;
    //指定页面元素定位表达式配置文件的绝对路径
    private ObjectMap objectMap = new ObjectMap("D:\\Automation\\webUI\\src\\test\\java\\propertyFiles\\ObjectMap.properties");
    private WebDriver driver;
    public DatabaseManagement(WebDriver driver){
        this.driver = driver;
    }
    //返回数据库服务总览页面中Mysql数据库服务“立即使用”按钮页面元素对象
    public WebElement mysql() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(objectMap.getLocator("pass.databasemanagement.mysql"));
        return element;
    }
    //返回数据库服务总览页面中MongoDB数据库服务“立即使用”按钮页面元素对象
    public WebElement mongodb() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(objectMap.getLocator("pass.databasemanagement.mongodb"));
        return element;
    }
    //返回数据库服务总览页面中Redis缓存服务“立即使用”按钮页面元素对象
    public WebElement redis() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(objectMap.getLocator("pass.databasemanagement.redis"));
        return element;
    }
    //返回数据库服务总览页面中ElasticSearch服务“立即使用”按钮页面元素对象
    public WebElement elasticsearch() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(objectMap.getLocator("pass.databasemanagement.elasticsearch"));
        return element;
    }
    @Test
    public void unittestDatabaseManagement(){

    }
}

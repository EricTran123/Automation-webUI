package pageObjects;

import Util.ObjectMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CommunicationManagement {
    private WebElement element = null;
    //指定页面元素定位表达式配置文件的绝对路径
    private ObjectMap objectMap = new ObjectMap("D:\\Automation\\webUI\\src\\test\\java\\propertyFiles\\ObjectMap.properties");
    private WebDriver driver;
    public CommunicationManagement(WebDriver driver){
        this.driver = driver;
    }
    //返回通信服务总览页面中Kafka服务“立即使用”按钮页面元素对象
    public WebElement kafkaservice() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(objectMap.getLocator("paas.communicationmanagement.kafkaservice"));
        return element;
    }
    //返回通信服务总览页面中sms服务“立即使用”按钮页面元素对象
    public WebElement sms() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(objectMap.getLocator("paas.communicationmanagement.sms"));
        return element;
    }
    //返回通信服务总览页面中email服务“立即使用”按钮页面元素对象
    public WebElement email() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(objectMap.getLocator("paas.communicationmanagement.email"));
        return element;
    }
    @Test
    public void unittestCommunicationManagement(){

    }
}

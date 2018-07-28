package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Util.*;

import static PropertyFiles.Constants.Path_ConfigurationFile;

public class LoginPage {
    private WebElement element = null;
    //指定页面元素定位表达式配置文件的绝对路径
    private GetElements getElements = new GetElements(Path_ConfigurationFile);
    private WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    //返回登陆页面中的用户名输入框页面元素对象
    public WebElement userName() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(getElements.getLocator("paas.loginPage.username"));
        return element;
    }
    //返回登陆页面中的密码输入框页面元素对象
    public WebElement password() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于密码的定位方式和定位表达式
        element = driver.findElement(getElements.getLocator("paas.loginPage.password"));
        return element;
    }
    //返回登陆页面中的用户名输入框页面元素对象
    public WebElement loginButton() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于登陆按钮的定位方式和定位表达式
        element = driver.findElement(getElements.getLocator("paas.loginPage.loginbutton"));
        return element;
    }
    //返回登陆成功后推出按钮元素对象
    public WebElement logoutButton() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置关于退出按钮的定位方式和定位表达式
        element = driver.findElement(getElements.getLocator("pass.loginPage.logoutbutton"));
        return element;
    }
}

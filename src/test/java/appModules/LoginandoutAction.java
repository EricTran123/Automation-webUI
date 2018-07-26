package appModules;

import Util.BrowserEngine;
import Util.Log;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import pageObjects.LoginPage;
import Util.KeyActionsUtil;


public class LoginandoutAction {
    static {
        //指定log4j配置文件为log4j.xml
        DOMConfigurator.configure("log4j.xml");
    }
    public static void login(WebDriver driver, String username, String password) throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        BrowserEngine.maxBrowser(driver);
        Log.info("最大化浏览器");
        loginPage.userName().sendKeys(username);
        Log.info("输入用户名..");
        loginPage.password().sendKeys(password);
        Log.info("输入密码....");
        loginPage.loginButton().click();
        Log.info("点击登陆....");
        KeyActionsUtil.sleep("2000");
    }
    public static void logout(WebDriver driver) throws Exception{
        LoginPage loginPage = new LoginPage(driver);
        loginPage.logoutButton().click();
    }
}

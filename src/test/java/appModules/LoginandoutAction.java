package appModules;

import Util.BrowserEngine;
import org.openqa.selenium.WebDriver;
import pageObjects.LoginPage;
import Util.KeyActions;


public class LoginandoutAction {
    public static void login(WebDriver driver, String username, String password) throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        BrowserEngine.maxBrowser(driver);
        loginPage.userName().sendKeys(username);
        loginPage.password().sendKeys(password);
        loginPage.loginButton().click();
        KeyActions.sleep("10000");
    }
    public static void logout(WebDriver driver) throws Exception{
        LoginPage loginPage = new LoginPage(driver);
        loginPage.logoutButton().click();
    }
}

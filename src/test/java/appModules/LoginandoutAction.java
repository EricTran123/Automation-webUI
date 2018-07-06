package appModules;

import org.openqa.selenium.WebDriver;
import pageObjects.LoginPage;


public class LoginandoutAction {
    public static void login(WebDriver driver, String username, String password) throws Exception {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.userName().sendKeys(username);
        loginPage.password().sendKeys(password);
        loginPage.loginButton().click();
        Thread.sleep(1000);
    }
    public static void logout(WebDriver driver) throws Exception{
        LoginPage loginPage = new LoginPage((driver));
        loginPage.logoutButton().click();
    }
}

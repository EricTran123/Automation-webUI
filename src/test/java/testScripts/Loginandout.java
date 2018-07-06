package testScripts;
import Util.BrowserEngine;
import appModules.LoginandoutAction;
import org.testng.annotations.*;
import org.openqa.selenium.*;


public class Loginandout {
    private BrowserEngine browserEngine = new BrowserEngine();
    private LoginandoutAction loginandout = new LoginandoutAction();
    private WebDriver driver = browserEngine.initBrowser("chrome");

    @Test
    public void testLoginandout() throws Exception {
        driver.get("http://paasweb.tpaas.youedata.com/#/front/login");
        try {
            LoginandoutAction.login(driver, "davieyang", "GULGXmMl");
            LoginandoutAction.logout(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


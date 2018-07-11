package testScripts;
import Util.BrowserEngine;
import appModules.LoginandoutAction;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import Util.Log;
import static Util.KeyActions.*;


public class Loginandout {
    private WebDriver driver;
    static {
        //指定log4j配置文件为log4j.xml
        DOMConfigurator.configure("log4j.xml");
    }
    @BeforeMethod
    public void setUp() {
        driver = BrowserEngine.initBrowser("chrome");
    }
    @Test
    public void testLoginandout() throws Exception {
        driver.get("http://paasweb.tpaas.youedata.com/#/front/login");
        LoginandoutAction.login(driver, "davieyang","111111");
        Log.info("登陆成功");
        assert_String(driver,"退出");
        LoginandoutAction.logout(driver);
        Log.info("退出成功");
        close_Browser(driver);
    }
}


package testScripts;
import Util.BrowserEngine;
import AppModules.LoginandoutAction;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import Util.Log;
import static Util.KeyActionsUtil.*;


public class TestLoginandout {
    private WebDriver driver = BrowserEngine.initBrowser("chrome");
    static {
        //指定log4j配置文件为log4j.xml
        DOMConfigurator.configure("log4j.xml");
    }
    @Test
    public void testLoginandout() throws Exception {
        driver.get("http://paasweb.tpaas.youedata.com/#/front/login");
        LoginandoutAction.login(driver, "davieyang11","222222");
        assert_String(driver,"退出");
        Log.info("登陆成功");
        LoginandoutAction.logout(driver);
        assert_String(driver,"登陆");
        Log.info("退出成功");
        close_Browser(driver);
    }
}


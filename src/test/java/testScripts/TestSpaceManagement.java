package testScripts;

import Util.BrowserEngine;
import Util.Log;
import AppModules.LoginandoutAction;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import PageObjects.SpaceManagement;
import static Util.KeyActionsUtil.*;
import static AppModules.SpaceManagementAction.linkToSpaceManagementPage;
import static PropertyFiles.Constants.LoginPage;

public class TestSpaceManagement {
    private WebDriver driver = BrowserEngine.initBrowser("chrome");
    SpaceManagement spaceManagement = new PageObjects.SpaceManagement(driver);
    static {
        //指定log4j配置文件为log4j.xml
        DOMConfigurator.configure("log4j.xml");
    }

    @Test
    public void testNewSpace()throws Exception{
        driver.get(LoginPage);
        LoginandoutAction.login(driver, "davieyang11","111111");
        assert_String(driver,"退出");
        Log.info("登陆成功...");
        linkToSpaceManagementPage(driver);
        sleep("1000");
        assert_String(driver,"创建空间");
        spaceManagement.newspacebutton().click();
        spaceManagement.spacename().sendKeys("testspace");
        spaceManagement.newcpu().clear();
        spaceManagement.newcpu().sendKeys("2");
        spaceManagement.newmem().clear();
        spaceManagement.newmem().sendKeys("10");
        sleep("2000");
        spaceManagement.newsavebutton().click();
        sleep("10000");
        assert_String(driver,"testspace");
    }
    @Test
    public void testDeleteSpace() throws Exception {
        spaceManagement.releaseButton().click();
        Log.info("点击释放按钮...");
        sleep("2000");
        spaceManagement.releaseConfirmButton().sendKeys(Keys.ENTER);
        Log.info("点击确认...");
        sleep("2000");
        assert_NoString(driver,"testspace");
        Log.info("断言页面不存在该空间");
    }
    @Test
    public void testModifySpace() throws Exception{
        spaceManagement.extendbutton().click();
        Log.info("点击配置空间按钮...");
        sleep("2000");
        spaceManagement.mem().sendKeys("10");
        spaceManagement.cpu().sendKeys("5");
        spaceManagement.savebutton().click();
        close_Browser(driver);
        Log.info("关闭浏览器...");
    }
}

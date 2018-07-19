package testScripts;

import Util.BrowserEngine;
import Util.Log;
import appModules.LoginandoutAction;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageObjects.SpaceManagement;

import static Util.KeyActionsUtil.assert_String;
import static Util.KeyActionsUtil.close_Browser;
import static Util.KeyActionsUtil.sleep;
import static Util.WaitElementUntil.waitWebElement;
import static appModules.SpaceManagementAction.linkToSpaceManagementPage;

public class CreateSpaceManagement {
    private WebDriver driver = BrowserEngine.initBrowser("chrome");
    SpaceManagement spaceManagement = new SpaceManagement(driver);
    static {
        //指定log4j配置文件为log4j.xml
        DOMConfigurator.configure("log4j.xml");
    }

    @Test
    public void testNewSpace()throws Exception{
        driver.get("http://paasweb.tpaas.youedata.com/#/front/login");
        LoginandoutAction.login(driver, "davieyang11","222222");
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
        spaceManagement.newsavebutton().click();
        sleep("10000");
        assert_String(driver,"testspace");
    }

    public void testDeleteSpace() throws Exception {
        spaceManagement.releaseButton().click();
        spaceManagement.releaseConfirmButton().click();

    }
}

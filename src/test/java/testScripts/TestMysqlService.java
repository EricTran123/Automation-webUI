package testScripts;

import Util.BrowserEngine;
import Util.Log;
import Util.ScrollBar;
import AppModules.LoginandoutAction;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import PageObjects.DatabaseManagement;
import PageObjects.MySQLService;

import static Util.KeyActionsUtil.assert_String;
import static Util.KeyActionsUtil.sleep;
import static Util.WaitElementUntil.sleep;
import static PropertyFiles.Constants.Database_Main;
import static PropertyFiles.Constants.LoginPage;

public class TestMysqlService {
    private WebDriver driver = BrowserEngine.initBrowser("chrome");
    DatabaseManagement databaseManagement = new DatabaseManagement(driver);
    MySQLService mySQLService = new MySQLService(driver);
    private ScrollBar scrollBar = new ScrollBar();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    static {
        DOMConfigurator.configure("log4j.xml");
    }
    @Test
    public void testCreateMysqlService() throws Exception {
        driver.get(LoginPage);
        LoginandoutAction.login(driver, "davieyang11","222222");
        assert_String(driver,"退出");
        Log.info("登陆成功...");
        driver.get(Database_Main);
        Log.info("进入数据库总览页面...");
        Thread.sleep(1000);
        scrollBar.scrolltoBottom(driver);
        Log.info("滚动条滚动到页面底部...");
        databaseManagement.mysql().click();
        sleep(2000);
        mySQLService.newinstance().click();
        mySQLService.instancename().sendKeys("automationtest");
        mySQLService.description().sendKeys("automationtest");
        mySQLService.standard5_6().click();
        mySQLService.instancestandard().click();
        sleep("2000");
        mySQLService.ic2gb().click();
        mySQLService.storespace().clear();
        mySQLService.storespace().sendKeys("1");
        scrollBar.scrolltoBottom(driver);
        sleep(2000);
        mySQLService.outsideaccess().click();
        mySQLService.password().sendKeys("111111");
        mySQLService.repassword().sendKeys("111111");
        mySQLService.surebutton().sendKeys(Keys.ENTER);
        sleep(2000);
        assert_String(driver,"automationtest");
    }
    @Test
    public void testRestartMysqlService(){

    }
    @Test
    public void testReleaseMysqlService(){

    }
    @Test
    public void testManageMysqlService(){

    }
    @Test
    public void testReviewLog(){

    }
    @Test
    public void testMonitorMysqlService(){

    }
}

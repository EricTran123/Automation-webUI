package testScripts;

import Util.BrowserEngine;
import Util.ScrollBar;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageObjects.MysSQLService;

public class TestMysqlService {
    private WebDriver driver = BrowserEngine.initBrowser("chrome");
    MysSQLService mysSQLService = new MysSQLService(driver);
    private ScrollBar scrollBar = new ScrollBar();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    static {
        DOMConfigurator.configure("log4j.xml");
    }
    @Test
    public void testCreateMysqlService(){

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

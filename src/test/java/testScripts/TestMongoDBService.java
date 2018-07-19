package testScripts;

import Util.BrowserEngine;
import Util.ScrollBar;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageObjects.MongoDBService;

public class TestMongoDBService {
    private WebDriver driver = BrowserEngine.initBrowser("chrome");
    MongoDBService mongoDBService = new MongoDBService(driver);
    private ScrollBar scrollBar = new ScrollBar();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    static {
        DOMConfigurator.configure("log4j.xml");
    }
    @Test
    public void testCreateMongoDBService(){

    }
    @Test
    public void testRestartMongoDBService(){

    }
    @Test
    public void testReleaseMongoDBService(){

    }
    @Test
    public void testManageMongoDBService(){

    }
    @Test
    public void testReviewLog(){

    }
    @Test
    public void testMonitorMongoDBService(){

    }
}

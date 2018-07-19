package testScripts;

import Util.BrowserEngine;
import Util.ScrollBar;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageObjects.RedisService;

public class TestRedisService {
    private WebDriver driver = BrowserEngine.initBrowser("chrome");
    RedisService redisService = new RedisService(driver);
    private ScrollBar scrollBar = new ScrollBar();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    static {
        DOMConfigurator.configure("log4j.xml");
    }
    @Test
    public void testCreateRedisService(){

    }
    @Test
    public void testRestartRedisService(){

    }
    @Test
    public void testReleaseRedisService(){

    }
    @Test
    public void testManageRedisService(){

    }
    @Test
    public void testReviewLog(){

    }
    @Test
    public void testMonitorRedisService(){

    }
}

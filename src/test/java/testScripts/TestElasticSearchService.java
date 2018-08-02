package testScripts;

import Util.BrowserEngine;
import Util.ScrollBar;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import PageObjects.ElasticSearchService;

public class TestElasticSearchService {
    private WebDriver driver = BrowserEngine.initBrowser("chrome");
    ElasticSearchService elasticSearchService = new ElasticSearchService(driver);
    private ScrollBar scrollBar = new ScrollBar();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    static {
        DOMConfigurator.configure("log4j.xml");
    }
    @Test
    public void testCreateElasticSearchService(){

    }
    @Test
    public void testRestartElasticSearchService(){

    }
    @Test
    public void testReleaseElasticSearchService(){

    }
    @Test
    public void testManageElasticSearchService(){

    }
    @Test
    public void testReviewLog(){

    }
    @Test
    public void testMonitorElasticSearchService(){

    }
}

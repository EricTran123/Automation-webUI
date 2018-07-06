package testScripts;
import Util.BrowserEngine;
import Util.ScrollBar;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestScroll {
    private BrowserEngine browserEngine = new BrowserEngine();
    private WebDriver driver = browserEngine.initBrowser("chrome");
    private ScrollBar scrollBar = new ScrollBar();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    @Test
    public void testScroll() throws InterruptedException {
        driver.get("http://www.baidu.com");
        driver.findElement(By.xpath("//*[@id = 'kw']")).sendKeys("selenium");
        driver.findElement(By.xpath("//*[@id = 'su']")).click();
        Thread.sleep(3000);
        scrollBar.scrolltoBottom(driver);
        //scrollBar.toBottom(driver);
        //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(3000);
        scrollBar.scrolltoTop(driver);
        //scrollBar.toTop(driver);
        //js.executeScript("document.documentElement.scrollTop=0");
        WebElement element = driver.findElement(By.xpath("//*[@id='help']/a[1]"));
        Thread.sleep(3000);
        scrollBar.scrolltoPresence(driver, element);
    }
}

package Util;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BrowserEngine {
    private static WebDriver driver = null;
    private static long timeOutInSeconds = 10;
    private static Select select = null;
    private static Alert alert = null;
    private static WebDriverWait wait = null;
    public static WebDriver initBrowser(String Browser) {
        if(Browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
            driver = new ChromeDriver();
        }else if (Browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver","C:\\Program Files\\Internet Explorer\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }else {
            System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Mozilla Firefox\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        return driver;
    }
    public WebDriver caseBrowser(String browser) {
        switch (browser) {
            case "ie":
                System.setProperty("webdriver.ie.driver","C:\\Program Files\\Internet Explorer\\IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            case "chrome":
                System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            default:
                try {
                    throw new Exception("浏览器错误!");
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }
        return driver;
    }
    public void openBrowser(String url, String browser) {
        driver = initBrowser(browser);
        driver.manage().timeouts().implicitlyWait(timeOutInSeconds, TimeUnit.SECONDS);
        driver.get(url);
    }
    public static void closeAllBrowser() {
        driver.quit();
    }
    public static void closeCurrentBrowser() {
        driver.close();
    }
    public static void maxBrowser() {
        driver.manage().window().maximize();
    }
    public static void setBrowserSize(int width, int height) {
        driver.manage().window().setSize(new Dimension(width, height));
    }
    public static String getURL() {
        return driver.getCurrentUrl();
    }
    public static String getTitle() {
        return driver.getTitle();
    }
    public static void refreshPage() {
        driver.navigate().refresh();
    }
    public static String getElementText(By locator) {
        return driver.findElement(locator).getText();
    }
    public static void selectByValue(By locator, String value) {
        select = new Select(driver.findElement(locator));
        select.selectByValue(value);
    }
    public static void selectByText(By locator, String text) {
        select = new Select(driver.findElement(locator));
        select.selectByVisibleText(text);
    }
    public static void selectByIndex(By locator, int index) {
        select = new Select(driver.findElement(locator));
        select.selectByIndex(index);
    }
    public static void submitForm(By locator) {
        driver.findElement(locator).submit();
    }
    public static void uploadFile(By locator, String filePath) {
        driver.findElement(locator).sendKeys(filePath);
    }
    public static void switchToFrame(By locator) {
        driver.switchTo().frame(driver.findElement(locator));
    }
    public static void switchToParentFrame() {
        driver.switchTo().defaultContent();
    }
    public static void dismissAlert() {
        alert = driver.switchTo().alert();
        alert.dismiss();
    }
    public static void acceptAlert() {
        alert = driver.switchTo().alert();
        alert.accept();
    }
    public static String getAlertText() {
        alert = driver.switchTo().alert();
        return alert.getText();
    }
    public static void inputTextToAlert(String text) {
        alert = driver.switchTo().alert();
        alert.sendKeys(text);
    }
    public static void deleteCookie(String name) {
        driver.manage().deleteCookieNamed(name);
    }

    public static void deleteAllCookies() {
        driver.manage().deleteAllCookies();
    }
    public static Map<String, String> getCookieByName(String name) {
        Cookie cookie = driver.manage().getCookieNamed(name);
        if (cookie != null) {
            Map<String, String> map = new HashMap<String, String>();
            map.put("name", cookie.getName());
            map.put("value", cookie.getValue());
            map.put("path", cookie.getPath());
            map.put("domain", cookie.getDomain());
            map.put("expiry", cookie.getExpiry().toString());
            return map;
        }
        return null;
    }
    public static Set<Cookie> getAllCookies() {
        return driver.manage().getCookies();
    }
    public static void addCookie(String name, String value) {
        driver.manage().addCookie(new Cookie(name, value));
    }
    public static void addCookie(String name, String value, String path) {
        driver.manage().addCookie(new Cookie(name, value, path));
    }

}



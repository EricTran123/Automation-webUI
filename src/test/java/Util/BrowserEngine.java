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

import static propertyFiles.Constants.Path_BrowserDrivers;

public class BrowserEngine {
    private static WebDriver driver = null;
    private static long timeOutInSeconds = 10;
    private static Select select = null;
    private static Alert alert = null;
    private static WebDriverWait wait = null;
    public static WebDriver initBrowser(String Browser) {
        if(Browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver",Path_BrowserDrivers+"chromedriver.exe");
            driver = new ChromeDriver();
        }else if (Browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver",Path_BrowserDrivers+"IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }else {
            System.setProperty("webdriver.gecko.driver", Path_BrowserDrivers+"geckodriver.exe");
            driver = new FirefoxDriver();
        }
        return driver;
    }
    public WebDriver caseBrowser(String browser) {
        switch (browser) {
            case "ie":
                System.setProperty("webdriver.ie.driver",Path_BrowserDrivers+"IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", Path_BrowserDrivers+"geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            case "chrome":
                System.setProperty("webdriver.chrome.driver",Path_BrowserDrivers+"chromedriver.exe");
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
    public static String getURL() {
        return driver.getCurrentUrl();
    }
    public static void selectByValue(String string, String value) {
        select = new Select(driver.findElement(By.xpath(string)));
        select.selectByValue(value);
    }
    public static void selectByText(String string, String text) {
        select = new Select(driver.findElement(By.xpath(string)));
        select.selectByVisibleText(text);
    }
    public static void selectByIndex(String string, int index) {
        select = new Select(driver.findElement(By.xpath(string)));
        select.selectByIndex(index);
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
    /**关闭浏览器*/
    public static void closeCurrentBrowser(WebDriver driver) {
        driver.close();
    }
    /**关闭所有浏览器*/
    public static void closeAllBrowser(WebDriver driver) {
        driver.quit();
    }
    /**最大化浏览器*/
    public static void maxBrowser(WebDriver driver) {
        driver.manage().window().maximize();
    }
    /**自定义浏览器尺寸*/
    public void setBrowserSize(int width, int height) {
        driver.manage().window().setSize(new Dimension(width, height));
    }
    /**获取当前URL*/
    public static String getURL(WebDriver driver) {
        return driver.getCurrentUrl();
    }
    /**获取当前浏览器页面的标题*/
    public String getTitle() {
        return driver.getTitle();
    }
    /**在浏览器的历史中向后到上一个页面, 即点击浏览器返回*/
    public void returnToPreviousPage() {
        driver.navigate().back();
    }
    /**在浏览器的历史中向前到下一个页面, 如果我们在最新的页面上看, 什么也不做, 即点击浏览器下一页*/
    public void forwardToNextPage() {
        driver.navigate().forward();
    }

    /**刷新页面*/
    public static void refreshPage() {
        driver.navigate().refresh();
    }

    /**WebDriver切换到当前页面*/
    public void switchToCurrentPage() {
        String handle = driver.getWindowHandle();
        for (String tempHandle : driver.getWindowHandles()) {
            if(tempHandle.equals(handle)) {
                driver.close();
            }else {
                driver.switchTo().window(tempHandle);
            }
        }
    }

    public void inputText(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }

    public void clickElement(By locator) {
        driver.findElement(locator).click();
    }

    public String getElementText(By locator) {
        return driver.findElement(locator).getText();
    }

    public void clearText(By locator) {
        driver.findElement(locator).clear();
    }

    public void submitForm(By locator) {
        driver.findElement(locator).submit();
    }

    public void uploadFile(By locator, String filePath) {
        driver.findElement(locator).sendKeys(filePath);
    }

}



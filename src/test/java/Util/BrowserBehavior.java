package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;


public class BrowserBehavior {
    public WebDriver driver;
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
    public void refreshPage() {
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

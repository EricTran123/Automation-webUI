package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class WaitElementUntil {
    public WebDriver driver = null;
    private long timeOutInSeconds =10;
    public Boolean waitUntilPageContainText(String text, long seconds) {
        try {
            return new WebDriverWait(driver, seconds).until(ExpectedConditions.textToBePresentInElement
                    (driver.findElement(By.tagName("body")), text));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public Boolean waitUntilPageContainText(String text) {
        try {
            return new WebDriverWait(driver, timeOutInSeconds).until(ExpectedConditions.textToBePresentInElement
                    (driver.findElement(By.tagName("body")), text));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public Boolean waitUntilElementVisible(By locator, int seconds) {
        try {
            new WebDriverWait(driver, seconds).until(ExpectedConditions.visibilityOfElementLocated(locator));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public Boolean waitUntilElementVisible(By locator) {
        try {
            new WebDriverWait(driver, timeOutInSeconds).until(ExpectedConditions.visibilityOfElementLocated(locator));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    /**用于测试执行过程中暂停程序执行的等待方法*/
    public void sleep(long millsecond){
        try{
            Thread.sleep(millsecond);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    /**显示等待页面元素出现，参数为页面元素xpath定位表达式*/
    public void waitWebElementPresence(WebDriver driver, String xpathExpression){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(presenceOfElementLocated(By.xpath(xpathExpression)));
    }
    /**显示等待页面元素可被点击状态，参数为页面元素xpath定位表达式*/
    public void waitWebElementToBeClickable(WebDriver driver, String xpathExpression){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(elementToBeClickable(By.xpath(xpathExpression)));
    }
    /**显示等待页面元素被选中状态，参数为页面元素xpath定位表达式*/
    public void waitWebElementToBeSelected(WebDriver driver, String xpathExpression){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(elementToBeSelected(By.xpath(xpathExpression)));
    }
    /**显示等待页面元素出现，参数为页面元素xpath定位表达式*/
    public void waitWebElementToBePresentInElementValue(WebDriver driver, String xpathExpression, String text){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(textToBePresentInElementValue(By.xpath(xpathExpression), text));
    }
    /**显示等待页面标题包含"title"元素出现，参数为页面元素xpath定位表达式*/
    public void waitWebElementTitleContains(WebDriver driver, String title){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(titleContains(title));
    }
}

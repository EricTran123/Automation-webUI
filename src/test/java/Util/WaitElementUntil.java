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
    /**用于测试执行过程中暂停程序执行的等待方法*/
    public static void sleep(long millsecond){
        try{
            Thread.sleep(millsecond);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    /**显示等待页面元素出现，参数为页面元素xpath定位表达式*/
    public static void waitWebElementPresence(WebDriver driver, String xpathExpression){
        WebDriverWait waitElement = new WebDriverWait(driver, 10);
        waitElement.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathExpression)));
    }
    /**显示等待页面元素可被点击状态，参数为页面元素xpath定位表达式*/
    public static void waitWebElementToBeClickable(WebDriver driver, String xpathExpression){
        WebDriverWait waitElement = new WebDriverWait(driver, 10);
        waitElement.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathExpression)));
    }
    /**显示等待页面元素被选中状态，参数为页面元素xpath定位表达式*/
    public static void waitWebElementToBeSelected(WebDriver driver, String xpathExpression){
        WebDriverWait waitElement = new WebDriverWait(driver, 10);
        waitElement.until(ExpectedConditions.elementToBeSelected(By.xpath(xpathExpression)));
    }
    /**显示等待页面元素出现，参数为页面元素xpath定位表达式*/
    public static void waitWebElementToBePresentInElementValue(WebDriver driver, String xpathExpression, String text){
        WebDriverWait waitElement = new WebDriverWait(driver, 10);
        waitElement.until(ExpectedConditions.textToBePresentInElementValue(By.xpath(xpathExpression), text));
    }
    /**显示等待页面标题包含"title"元素出现，参数为页面元素xpath定位表达式*/
    public static void waitWebElementTitleContains(WebDriver driver, String title){
        WebDriverWait waitElement = new WebDriverWait(driver, 10);
        waitElement.until(ExpectedConditions.titleContains(title));
    }
    public static void waitWebElementPresence(WebDriver driver, By by){
        WebDriverWait watiElement = new WebDriverWait(driver, 10);
        watiElement.until(ExpectedConditions.presenceOfElementLocated(by));
    }
}

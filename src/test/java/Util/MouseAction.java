package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;

public class MouseAction {
    public void lefClick(WebDriver driver, String xpathExpression) {
        Actions actions = new Actions(driver);
        // 鼠标左键在当前停留的位置做单击操作
        actions.click();
        // 鼠标左键点击指定的元素
        actions.click(driver.findElement(By.xpath(xpathExpression)));
    }

    public void rightClick(WebDriver driver, String xpathExpression) {
        Actions actions = new Actions(driver);
        // 鼠标右键在当前停留的位置做单击操作
        actions.contextClick();
        // 鼠标右键点击指定的元素
        actions.contextClick(driver.findElement(By.xpath(xpathExpression)));
    }

    public void doubleClick(WebDriver driver, String xpathExpression) {
        Actions actions = new Actions(driver);
        // 鼠标在当前停留的位置做双击操作
        actions.doubleClick();
        // 鼠标双击指定的元素
        actions.doubleClick(driver.findElement(By.xpath(xpathExpression)));

    }

    public void dragAction(WebDriver driver, WebElement source, WebElement target) {
        Actions actions = new Actions(driver);
        // 鼠标拖拽动作，将 source 元素拖放到 target 元素的位置
        actions.dragAndDrop(source, target);
    }

    public void dragtoXY(WebDriver driver, WebElement source, int xOffset, int yOffset) {
        Actions actions = new Actions(driver);
        // 鼠标拖拽动作，将 source 元素拖放到 (xOffset, yOffset) 位置，其中 xOffset 为横坐标，yOffset 为纵坐标
        actions.dragAndDropBy(source, xOffset, yOffset);

    }

    public void dragActionReleaseMouse(WebDriver driver, WebElement source, WebElement target) {
        Actions actions = new Actions(driver);
        // 鼠标拖拽动作，将 source 元素拖放到 target 元素的位置
        actions.clickAndHold(source).moveToElement(target).perform();
        actions.release();
    }

    public void clickAndHole(WebDriver driver, WebElement element) {
        Actions actions = new Actions(driver);
        //action.clickAndHold();鼠标悬停在当前位置，既点击并且不释放
        // 鼠标悬停在 onElement 元素的位置
        actions.clickAndHold(element);
    }

    public void moveToElement(WebDriver driver, WebElement element) {
        Actions actions = new Actions(driver);
        // 将鼠标移到 toElement 元素中点
        actions.moveToElement(element);

    }
    public void moveToXY(WebDriver driver, int xOffset, int yOffset){
        Actions actions = new Actions(driver);
        /**将鼠标移到元素 toElement 的 (xOffset, yOffset) 位置，这里的 (xOffset, yOffset) 是以元素 toElement 的左上角为 (0,0) 开始的 (x, y) 坐标轴
         *action.moveToElement(toElement,xOffset,yOffset)
         *以鼠标当前位置或者 (0,0) 为中心开始移动到 (xOffset, yOffset) 坐标轴*/
        actions.moveByOffset(xOffset, yOffset);
        actions.release();// 释放鼠标
    }
}

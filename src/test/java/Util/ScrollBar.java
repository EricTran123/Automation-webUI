package Util;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ScrollBar {
    public void toBottom(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //向下拉到底//
        js.executeScript("document.documentElement.scrollTop=10000");
    }

    public void toTop(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //向上拉到顶
        js.executeScript("document.documentElement.scrollTop=0");
    }

    public void scrolltoBottom(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //向下拉到底
        js.executeScript("scrollTo(0,100000)");
    }

    public void scrolltoTop(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //向上拉到顶
        js.executeScript("scrollTo(0,1)");
    }

    public void verticaltoMiddle(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //上下拉到中间
        js.executeScript("scrollBy(0, 0-document.body.scrollHeight *1/2)");
    }

    public void horizontaltoMiddle(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //左右拉到中间
        js.executeScript("scrollBy(0, 0-document.body.scrollWidht *1/2)");
    }
    public void scrolltoPresence(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //移动到元素element对象的“顶端”与当前窗口的“顶部”对齐
        //js.executeScript("arguments[0].scrollIntoView();", element);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        //移动到元素element对象的“底端”与当前窗口的“底部”对齐
        //js.executeScript("arguments[0].scrollIntoView(false);", element);
    }
}

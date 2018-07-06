package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TableAnalysis {
    //函数接受浏览器驱动，表格行数和列数，注意表头行，返回某个cell的值
    public static String tableCell(WebDriver driver, int row, int column) {
        String text = null;
        //avoid get the head line of the table
        row=row+1;
        String xpath="//*[@id='table138']/tbody/tr["+row+"]/td["+column+"]";
        WebElement table=driver.findElement(By.xpath(xpath));
        text=table.getText();
        return text;
    }
}

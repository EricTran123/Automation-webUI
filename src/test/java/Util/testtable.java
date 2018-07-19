package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import Util.BrowserEngine;

public class testtable {
    WebDriver drvier = BrowserEngine.initBrowser("chrome");
    //BrowserEngine browserEngine = new BrowserEngine();
    public static String tableCell(WebDriver driver,int row, int column) {
        String text = null;
        //avoid get the head line of the table
        row=row+1;
        String xpath="//*[@id='app']/section/section/main/section/div[2]/div[3]/table/tbody/tr["+row+"]/td["+column+"]";
        WebElement table=driver.findElement(By.xpath(xpath)); //*[@id="table138"]/tbody/tr[1]/td[1]/strong
        text=table.getText();
        return text;

    }
    @Test
    public void testTable() throws InterruptedException {
        //WebDriver drvier = BrowserEngine.initBrowser("chrome");
        drvier.manage().window().maximize();
        drvier.get("http://paasweb.tpaas.youedata.com");
        drvier.findElement(By.xpath("//*[@id='app']/section/main/div/form/div[1]/div/div/input")).sendKeys("davieyang");
        drvier.findElement(By.xpath("//*[@id='app']/section/main/div/form/div[2]/div/div/input")).sendKeys("GULGXmMl");
        Thread.sleep(5000);
        drvier.findElement(By.xpath("//*[@id='app']/section/main/div/form/div[4]/div/button")).click();
        Thread.sleep(5000);
        drvier.findElement(By.xpath("//*[@id='app']/section/header/div[1]/div[2]/p/span[1]")).click();
        Thread.sleep(3000);
        drvier.navigate().refresh();
        Thread.sleep(5000);
        drvier.findElement(By.xpath("//*[@id='app']/section/section/aside/ul/li[2]/div/a/span")).click();

        Thread.sleep(5000);
        drvier.findElement(By.xpath("//*[@id='app']/section/section/aside/ul/li[2]/ul/li[2]/a/span")).click();
        Thread.sleep(5000);
        drvier.findElement(By.xpath("//*[@id='app']/section/section/main/main/div[2]/div[1]/div/div/a")).click();
        Thread.sleep(5000);
        drvier.findElement(By.xpath("//*[@id='app']/section/section/main/section/div[2]/div[3]/table/tbody/tr[1]/td[5]/div/div/span")).click();
        Thread.sleep(5000);
        drvier.findElement(By.xpath("/html[1]/body[1]/ul[1]/li[4]")).click();
        Thread.sleep(5000);
        //String text = tableCell(drvier,1,3);
        //System.out.println(text);
    }
    @AfterMethod(alwaysRun = true)
    public void afterMethod(){
        drvier.quit();
    }
}

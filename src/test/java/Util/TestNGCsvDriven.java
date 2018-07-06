package Util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestNGCsvDriven {
    public WebDriver driver;
    String baseUrl = "http://www.sogou.com";
    //使用注解DataProvider将数据集合命名为“csvTestData”
    @DataProvider(name = "csvTestData")
    public static Object[][]words() throws IOException{
        //调用类中的静态方法getTestData，获取CSV文件的测试数据
        return getTestData("F:\\seleniumWithJava\\src\\test\\java\\testData\\testData.csv");
    }
    @BeforeMethod
    public void beforeMethod(){
        driver = new ChromeDriver();
    }
    @Test(dataProvider = "csvTestData")
    public void testSearch(String searchWord1, String searchWord2, String searchResult){
        driver.get(baseUrl+"/");
        driver.findElement(By.id("query")).sendKeys(searchWord1+" "+searchWord2);
        driver.findElement(By.id("stb")).click();
        Assert.assertTrue(driver.getPageSource().contains(searchResult));
    }
    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }
    //读取CSV文件的静态方法，使用CSV文件的绝对文件路径作为函数参数
    public static Object[][] getTestData(String fileName) throws IOException{
        List<Object[]> records = new ArrayList<Object[]>();
        String record;
        //设定UTF-8字符集，使用带缓冲区的字符输入流BufferedRead读取文件内容
        BufferedReader file = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "GBK"));
        //忽略读取CSV文件的标题行
        file.readLine();
        /** 遍历读取文件中除去第一行外的其他所有内容
         * 并存储在名人records的ArrayList中
         * 每一个records中存储的对象为一个String数组
         */
        while ((record=file.readLine())!=null){
            String fields[]=record.split(",");
            records.add(fields);
        }
        //关闭文件对象
        file.close();
        //定义函数返值, 即Object[][]
        //将存储测试数据的list转换为一个Object的二维数组
        Object[][] results = new Object[records.size()][];
        //设置二维数组每行的值，每行是一个Object对象
        for (int i = 0; i<records.size(); i++){
            results[i] = records.get(i);
        }
        return results;
    }
}

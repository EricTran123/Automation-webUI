package Util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNGDBDriven {
    public WebDriver driver;
    String baseUrl = "http://www.sogou.com";
    @DataProvider(name="testdata")
    public static Object[][] words() throws IOException{
        return getTestData("testdata");
    }
    @Test(dataProvider = "testdata")
    public void testSearch(String searchWord1, String searchWord2, String searchResult){
        driver.get(baseUrl + "/");
        driver.findElement(By.id("query")).sendKeys(searchWord1+" "+searchWord2);
        driver.findElement(By.id("stb")).click();
        Assert.assertTrue(driver.getPageSource().contains(searchResult));
    }
    @BeforeMethod
    public void beforeMethod(){
        driver = new ChromeDriver();
    }
    @AfterMethod
    private void afterMethod(){
        driver.quit();
    }
    public static Object[][] getTestData(String tablename) throws IOException{
        //声明Mysql数据库的驱动
        String dbDriver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1:3306/testng?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String user = "root";
        String password = "root";
        //声明存储测试数据的List对象
        List<Object[]> records = new ArrayList<Object[]>();
        try{
            //设定驱动
            Class.forName(dbDriver);
            Connection conn = DriverManager.getConnection(url,user,password);
            if (!conn.isClosed())
                System.out.println("连接数据库成功");
            //创建statement对象
            Statement statement = conn.createStatement();
            //拼接sql语句
            String sql = String.format("Select * from %s", tablename);
            //声明结果集对象rs，用于存储执行sql语句返回的数据结果集
            ResultSet rs = statement.executeQuery(sql);
            //声明一个ResultSetMetaData对象
            ResultSetMetaData rsMetaData = rs.getMetaData();
            //调用ResultSetMetaData对象的getColumnCount方法获取数据行的列数
            int cols = rsMetaData.getColumnCount();
            /**使用next方法遍历数据结果集中的所有数据行*/
            while (rs.next()){
                //声明一个字符串型数组，数组大小使用数据行的列个数进行声明
                String fields[] = new String[cols];
                int col = 0;
                //遍历所有数据行中的所有数据，并存储在字符串数组中
                for (int colIdx = 0; colIdx<cols; colIdx++){
                    fields[col] = rs.getString(colIdx+1);
                    col++;
                }
                //将每一行的数据存储到字符串数组后，存储到records中
                records.add(fields);
                //输出数据行中的前三列内容，用于验证数据库内容是否正确读取
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
            //关闭数据结果集对象
            rs.close();
            //关闭数据库连接
            conn.close();
        }catch (ClassNotFoundException e){
            System.out.println("未能找到Mysql的驱动类");
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
        //定义函数返回值,即Object[][]
        //将存储测试数据的list转换为一个Object的二维数组
        Object[][] results = new Object[records.size()][];
        //设置二维数组每行的值，每行是一个Object对象
        for (int i = 0; i<records.size(); i++){
            results[i] = records.get(i);
        }
        return results;
    }

}

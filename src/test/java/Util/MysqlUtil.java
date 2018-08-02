package Util;
import propertyFiles.Constants;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MysqlUtil {
    private static Connection connection;
    public static void createDataBase() throws ClassNotFoundException, SQLException {
        //加载驱动程序
        Class.forName(Constants.JDBC_DRIVER);
        //getConnection()方法，连接MySQL数据库！！
        connection = DriverManager.getConnection(Constants.DB_URL, Constants.USERNAME, Constants.PASSWORD);
        //创建statement类对象，用来执行SQL语句！！
        Statement statement = connection.createStatement();
        //要执行的SQL语句
        statement.executeUpdate(Constants.CREATEDATABASE);
        connection.close();
    }
        public static void createTable()throws Exception{
        //Connection connection;
        connection = DriverManager.getConnection(Constants.NEWDBURL,Constants.USERNAME,Constants.PASSWORD);
        if(!connection.isClosed())
            System.out.println("Succeeded connecting to new Database!");
        Statement newstatement = connection.createStatement();
        newstatement.executeUpdate(Constants.CREATETABLE);

    }
    public static void intertData()throws Exception{
        //Connection connection;
        connection = DriverManager.getConnection(Constants.NEWDBURL,Constants.USERNAME,Constants.PASSWORD);
        if(!connection.isClosed())
            System.out.println("Succeeded connecting to new Database!");
        Statement newstatement = connection.createStatement();
        newstatement.executeUpdate(Constants.INSERTDATA);

    }
    public static void searchData()throws Exception{
        //Connection connection;
        connection = DriverManager.getConnection(Constants.NEWDBURL,Constants.USERNAME,Constants.PASSWORD);
        if(!connection.isClosed())
            System.out.println("Succeeded connecting to new Database!");
        Statement newstatement = connection.createStatement();
        ResultSet result = newstatement.executeQuery(Constants.SEARCHDATA);
        String id;
        String name;
        String url;
        String country;
        while(result.next()){
            //获取id这列数据
            id = result.getString("id");
            //获取name这列数据
            name = result.getString("name");
            url = result.getString("url");
            country = result.getString("country");
            //输出结果
            System.out.println(id + "\t" + name + "\t" + url + "\t" + country);
        }
        result.close();
    }
    public static void deleteDataBase()throws Exception{
        //Connection connection;
        connection = DriverManager.getConnection(Constants.NEWDBURL,Constants.USERNAME,Constants.PASSWORD);
        if(!connection.isClosed())
            System.out.println("Succeeded connecting to new Database!");
        Statement newstatement = connection.createStatement();
        newstatement.executeUpdate(Constants.DROPDB);
    }
}

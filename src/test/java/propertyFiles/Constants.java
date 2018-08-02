package propertyFiles;

public class Constants {
        public static final String Path_ConfigurationFile = "D:\\webtest\\src\\test\\java\\propertyFiles\\ObjectMap.properties";
        public static final String Path_BrowserDrivers = "D:\\webtest\\src\\test\\java\\BrowserDrivers\\";
        public static final String LoginPage = "http://paasweb.tpaas.youedata.com/#/front/login";
        public static final String Database_Main= "http://paasweb.tpaas.youedata.com/#/front/databaseServicePage/main";
        public static final String Spacemanagement_Main = "http://paasweb.tpaas.youedata.com/#/front/spaceManage/main";
        public static final String Storagemanagement_Main = "http://paasweb.tpaas.youedata.com/#/front/ossService/main";
        public static final String Messageservice_Main = "http://paasweb.tpaas.youedata.com/#/front/messageServicePage/main";
        public static final String UserCenter_Main = "http://paasweb.tpaas.youedata.com/#/front/controlPanel/userManage";
        public static final String LogCenter_Main = "http://paasweb.tpaas.youedata.com/#/front/LogMonitor/log";
        public static final String MonitorCenter_Main = "http://paasweb.tpaas.youedata.com/#/front/LogMonitor/tenant";
        public static final String MirrorStorage_Main= "http://paasweb.tpaas.youedata.com/#/front/image/imageList";
        public static final String ApplicationStorage_Main = "http://paasweb.tpaas.youedata.com/#/front/AppLocation/AppLocation";
        public static final String APIManagement_Main = "http://paasweb.tpaas.youedata.com/#/front/apiAllList/apiAllList";

        // JDBC 驱动名及数据库 URL
        public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        public static final String DB_URL = "jdbc:mysql://localhost:3306/mysql?useUnicode=true&characterEncoding=UTF-8&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        public static final String NEWDBURL = "jdbc:mysql://localhost:3306/mysqltest?useUnicode=true&characterEncoding=UTF-8&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        // 数据库的用户名与密码，需要根据自己的设置
        public static final String USERNAME = "root";
        public static final String PASSWORD = "davieyang";
        //SQL语句
        public static final String CREATEDATABASE = "create database mysqltest;";
        public static final String CREATETABLE = "CREATE TABLE `test` (`id` int, `name` char(20),`url` varchar(255),`country` char(10));";
        public static final String INSERTDATA = "INSERT INTO `test` VALUES ('1', 'Google', 'https://www.google.cm/', 'USA'), ('2', '淘宝', 'https://www.taobao.com/','CN'), ('3', '菜鸟教程', 'http://www.runoob.com','aaa'), ('4', '微博', 'http://weibo.com/','CN'), ('5', 'Facebook', 'https://www.facebook.com/', 'USA');";
        public static final String SEARCHDATA = "select * from test";
        public static final String DROPDB = "drop DATABASE mysqltest";
}




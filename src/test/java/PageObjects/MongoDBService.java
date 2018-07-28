package PageObjects;

import Util.GetElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static PropertyFiles.Constants.Path_ConfigurationFile;

public class MongoDBService {
    private WebElement element = null;
    //指定页面元素定位表达式配置文件的绝对路径
    private GetElements getElements = new GetElements(Path_ConfigurationFile);
    private WebDriver driver;
    public MongoDBService(WebDriver driver){
        this.driver = driver;
    }
    //返回MongoDB数据库服务页面“刷新”按钮的页面元素对象
    public WebElement refreshbutton() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(getElements.getLocator("paas.mongodb.refreshbutton"));
        return element;
    }
    //返回MongoDB数据库服务页面“创建实例”按钮的页面元素对象
    public WebElement newinstance() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(getElements.getLocator("paas.mongodb.newinstance"));
        return element;
    }
    //返回MongoDB数据库服务页面MongoDB名称检索控件的页面元素对象
    public WebElement searchinstancename() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(getElements.getLocator("paas.mongodb.searchinstancename"));
        return element;
    }
    //返回MongoDB数据库服务页面运行空间检索控件页面元素对象
    public WebElement searchspacename() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(getElements.getLocator("paas.mongodb.searchspacename"));
        return element;
    }
    //返回MongoDB数据库服务页面操作列“。。。”按钮的页面元素对象
    public WebElement operation() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(getElements.getLocator("paas.mongodb.operation"));
        return element;
    }
    //返回MongoDB数据库服务页面操作列“。。。”里下拉列表里的“重启”按钮的页面元素对象
    public WebElement operationrestart() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(getElements.getLocator("paas.mongodb.operationrestart"));
        return element;
    }
    //返回MongoDB数据库服务页面操作列“。。。”里下拉列表里的“释放”按钮的页面元素对象
    public WebElement operationrelease() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(getElements.getLocator("paas.mongodb.operationrelease"));
        return element;
    }
    //返回MongoDB数据库服务页面操作列“。。。”里下拉列表里的“管理”按钮的页面元素对象
    public WebElement operationmanage() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(getElements.getLocator("paas.mongodb.operationmanage"));
        return element;
    }
    //返回MongoDB数据库服务页面操作列“。。。”里下拉列表里的“日志”按钮的页面元素对象
    public WebElement operationlog() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(getElements.getLocator("paas.mongodb.operationlog"));
        return element;
    }
    //返回MongoDB数据库服务页面操作列“。。。”里下拉列表里的“监控”按钮的页面元素对象
    public WebElement operationmonitor() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(getElements.getLocator("paas.mongodb.operationmonitor"));
        return element;
    }
}

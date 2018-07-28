package PageObjects;

import Util.GetElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static PropertyFiles.Constants.Path_ConfigurationFile;

public class MySQLService {
    private WebElement element = null;
    //指定页面元素定位表达式配置文件的绝对路径
    private GetElements getElements = new GetElements(Path_ConfigurationFile);
    private WebDriver driver;
    public MySQLService(WebDriver driver){
        this.driver = driver;
    }
    //返回MySQL数据库服务页面“刷新”按钮的页面元素对象
    public WebElement refreshbutton() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(getElements.getLocator("paas.mysql.refreshbutton"));
        return element;
    }
    //返回MySQL数据库服务页面“创建实例”按钮的页面元素对象
    public WebElement newinstance() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = this.driver.findElement(getElements.getLocator("paas.mysql.newinstance"));
        return element;
    }
    //返回MySQL数据库服务页面MySQL名称检索控件的页面元素对象
    public WebElement searchinstancename() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(getElements.getLocator("paas.mysql.searchinstancename"));
        return element;
    }
    //返回MySQL数据库服务页面运行空间检索控件页面元素对象
    public WebElement searchspacename() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(getElements.getLocator("paas.mysql.searchspacename"));
        return element;
    }
    //返回MySQL数据库服务页面操作列“。。。”按钮的页面元素对象
    public WebElement operation() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(getElements.getLocator("paas.mysql.operation"));
        return element;
    }
    //返回MySQL数据库服务页面操作列“。。。”里下拉列表里的“重启”按钮的页面元素对象
    public WebElement operationrestart() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(getElements.getLocator("paas.mysql.operationrestart"));
        return element;
    }
    //返回MySQL数据库服务页面操作列“。。。”里下拉列表里的“释放”按钮的页面元素对象
    public WebElement operationrelease() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(getElements.getLocator("paas.mysql.operationrelease"));
        return element;
    }
    //返回MySQL数据库服务页面操作列“。。。”里下拉列表里的“管理”按钮的页面元素对象
    public WebElement operationmanage() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(getElements.getLocator("paas.mysql.operationmanage"));
        return element;
    }
    //返回MySQL数据库服务页面操作列“。。。”里下拉列表里的“日志”按钮的页面元素对象
    public WebElement operationlog() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(getElements.getLocator("paas.mysql.operationlog"));
        return element;
    }
    //返回MySQL数据库服务页面操作列“。。。”里下拉列表里的“监控”按钮的页面元素对象
    public WebElement operationmonitor() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(getElements.getLocator("paas.mysql.operationmonitor"));
        return element;
    }
    public WebElement instancename() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(getElements.getLocator("paas.newinstance.instancename"));
        return element;
    }
    public WebElement description() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(getElements.getLocator("paas.newinstance.description"));
        return element;
    }
    public WebElement standard5_6() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(getElements.getLocator("paas.newinstance.standard5.6"));
        return element;
    }
    public WebElement standard5_7() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(getElements.getLocator("paas.newinstance.standard5.7"));
        return element;
    }
    public WebElement storespace() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(getElements.getLocator("paas.newinstance.storespace"));
        return element;
    }
    public WebElement storespacefloating() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(getElements.getLocator("paas.newinstance.storespacefloating"));
        return element;
    }
    public WebElement runtimespace() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(getElements.getLocator("paas.newinstance.runtimespace"));
        return element;
    }
    public WebElement outsideaccess() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(getElements.getLocator("paas.newinstance.outsideaccess"));
        return element;
    }
    public WebElement password() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(getElements.getLocator("paas.newinstance.password"));
        return element;
    }
    public WebElement repassword() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(getElements.getLocator("paas.newinstance.repassword"));
        return element;
    }
    public WebElement cancelbutton() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(getElements.getLocator("paas.newinstance.cancelbutton"));
        return element;
    }
    public WebElement surebutton() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(getElements.getLocator("paas.newinstance.surebutton"));
        return element;
    }
    public WebElement instancestandard()throws Exception{
        element = driver.findElement(getElements.getLocator("paas.newinstance.instancestandard"));
        return element;
    }
    public WebElement ic2gb()throws Exception{
        element = driver.findElement(getElements.getLocator("paas.newinstance.1c2gb"));
        return element;
    }
}

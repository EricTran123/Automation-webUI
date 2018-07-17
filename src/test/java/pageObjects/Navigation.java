package pageObjects;

import Util.ObjectMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static propertyFiles.Constants.Path_ConfigurationFile;

public class Navigation {
    private WebElement element = null;
    //指定页面元素定位表达式配置文件的绝对路径
    private ObjectMap objectMap = new ObjectMap(Path_ConfigurationFile);
    private WebDriver driver;
    public Navigation(WebDriver driver){
        this.driver = driver;
    }
    //返回页面中“首页”菜单页面元素对象
    public WebElement main() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(objectMap.getLocator("paas.navigation.main"));
        return element;
    }
    //返回页面中“资源管理”菜单页面元素
    public WebElement resouces() throws Exception{
        element = driver.findElement(objectMap.getLocator("paas.navigation.resources"));
        return element;
    }
    //返回页面中“数据市场”菜单页面元素
    public WebElement datamarket() throws Exception{
        element = driver.findElement(objectMap.getLocator("paas.navigation.datamarket"));
        return element;
    }
    //返回页面中“能力矩阵”菜单页面元素
    public WebElement abilitymatrix() throws Exception{
        element = driver.findElement(objectMap.getLocator("paas.navigation.abilitymatrix"));
        return element;
    }
    //返回页面中“应用管理”菜单页面元素
    public WebElement applicationmanagement() throws Exception{
        element = driver.findElement(objectMap.getLocator("paas.navigation.applicationmanagement"));
        return element;
    }
    //返回页面中“日志监控”菜单页面元素
    public WebElement logmonitor() throws Exception{
        element = driver.findElement(objectMap.getLocator("paas.navigation.logmonitor"));
        return element;
    }
    //返回页面中“账户中心”菜单页面元素
    public WebElement userscenter() throws Exception{
        element = driver.findElement(objectMap.getLocator("paas.navigation.userscenter"));
        return element;
    }
    //返回页面中二级导航-资源管理“空间管理”菜单页面元素
    public WebElement spacemanagement() throws Exception{
        element = driver.findElement(objectMap.getLocator("paas.resources.spacemanagement"));
        return element;
    }
    //返回页面中二级导航-资源管理“数据库管理”菜单页面元素
    public WebElement databasemanagement() throws Exception{
        element = driver.findElement(objectMap.getLocator("paas.resources.databasemanagement"));
        return element;
    }
    //返回页面中二级导航-资源管理“存储管理”菜单页面元素
    public WebElement storemanagement() throws Exception{
        element = driver.findElement(objectMap.getLocator("paas.resources.storemanagement"));
        return element;
    }
    //返回页面中二级导航-资源管理“通信服务管理”菜单页面元素
    public WebElement communicationmanagement() throws Exception{
        element = driver.findElement(objectMap.getLocator("paas.resources.communicationmanagement"));
        return element;
    }
    //返回页面中二级导航-数据市场“数据接口”菜单页面元素
    public WebElement datainterface() throws Exception{
        element = driver.findElement(objectMap.getLocator("paas.datamarket.datainterface"));
        return element;
    }
    //返回页面中二级导航-数据市场“数据文件”菜单页面元素
    public WebElement datafile() throws Exception{
        element = driver.findElement(objectMap.getLocator("paas.datamarket.datafile"));
        return element;
    }
    //返回页面中二级导航-数据市场“数据管道”菜单页面元素
    public WebElement datapip() throws Exception{
        element = driver.findElement(objectMap.getLocator("paas.datamarket.datapip"));
        return element;
    }
    //返回页面中二级导航-能力矩阵“API管理”菜单页面元素
    public WebElement APImanagement() throws Exception{
        element = driver.findElement(objectMap.getLocator("paas.abilitymatrix.APImanagement"));
        return element;
    }
    //返回页面中二级导航-应用管理“镜像仓库”菜单页面元素
    public WebElement mirrorstore() throws Exception{
        element = driver.findElement(objectMap.getLocator("paas.applicationmanagement.mirrorstore"));
        return element;
    }
    //返回页面中二级导航-应用管理“应用仓库”菜单页面元素
    public WebElement applicationstore() throws Exception{
        element = driver.findElement(objectMap.getLocator("paas.applicationmanagement.applicationstore"));
        return element;
    }
    //返回页面中二级导航-日志监控“日志中心”菜单页面元素
    public WebElement logcenter() throws Exception{
        element = driver.findElement(objectMap.getLocator("paas.logmonitor.logcenter"));
        return element;
    }
    //返回页面中二级导航-日志监控“监控中心”菜单页面元素
    public WebElement monitorcenter() throws Exception{
        element = driver.findElement(objectMap.getLocator("paas.logmonitor.monitorcenter"));
        return element;
    }
}

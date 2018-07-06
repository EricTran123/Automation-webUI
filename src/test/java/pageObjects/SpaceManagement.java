package pageObjects;

import Util.ObjectMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SpaceManagement {
    private WebElement element = null;
    //指定页面元素定位表达式配置文件的绝对路径
    private ObjectMap objectMap = new ObjectMap("D:\\Automation\\webUI\\src\\test\\java\\propertyFiles\\ObjectMap.properties");
    private WebDriver driver;
    public SpaceManagement(WebDriver driver){
        this.driver = driver;
    }
    //返回空间管理页面中“扩容”按钮页面元素对象
    public WebElement extendbutton() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(objectMap.getLocator("paas.spacemanagement.extendbutton"));
        return element;
    }
    //返回空间管理页面中“新增空间”按钮页面元素对象
    public WebElement newspacebutton() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(objectMap.getLocator("paas.spacemanagement.newspacebutton"));
        return element;
    }
    //返回空间管理页面-新增空间窗口中“空间名称”页面元素对象
    public WebElement spacename() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(objectMap.getLocator("paas.newspace.spacename"));
        return element;
    }
    //返回空间管理页面-新增空间窗口中“cpu输入框”页面元素对象
    public WebElement newcpu() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(objectMap.getLocator("paas.newspace.cpu"));
        return element;
    }
    //返回空间管理页面-新增空间窗口中“cpu滑块”页面元素对象
    public WebElement newcpufloat() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(objectMap.getLocator("paas.newspace.cpufloat"));
        return element;
    }
    //返回空间管理页面-新增空间窗口中“内存输入框”页面元素对象
    public WebElement newmem() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(objectMap.getLocator("paas.newspace.mem"));
        return element;
    }
    //返回空间管理页面-新增空间窗口中“内存滑块”页面元素对象
    public WebElement newmemfloat() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(objectMap.getLocator("paas.newspace.memfloat"));
        return element;
    }
    //返回空间管理页面-新增空间窗口中“保存”按钮页面元素对象
    public WebElement newsavebutton() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(objectMap.getLocator("paas.newspace.savebutton"));
        return element;
    }
    //返回空间管理页面-新增空间窗口中“取消”按钮页面元素对象
    public WebElement newcancelbutton() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(objectMap.getLocator("paas.newspace.cancelbutton"));
        return element;
    }
    //返回空间管理页面-新增空间窗口中右上角“X”按钮页面元素对象
    public WebElement newXbutton() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(objectMap.getLocator("paas.newspace.Xbutton"));
        return element;
    }
    //返回空间管理页面-空间扩容窗口中“租户空间”下拉框页面元素对象
    public WebElement space() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(objectMap.getLocator("paas.excendspace.space"));
        return element;
    }
    //返回空间管理页面-空间扩容窗口中“cpu输入框”页面元素对象
    public WebElement cpu() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(objectMap.getLocator("paas.excendspace.cpu"));
        return element;
    }
    //返回空间管理页面-空间扩容窗口中“cpu滑块”页面元素对象
    public WebElement cpufloat() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(objectMap.getLocator("paas.excendspace.cpufloat"));
        return element;
    }
    //返回空间管理页面-空间扩容窗口中“内存输入框”页面元素对象
    public WebElement mem() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(objectMap.getLocator("paas.excendspace.mem"));
        return element;
    }
    //返回空间管理页面-空间扩容窗口中“内存滑块”页面元素对象
    public WebElement memfloat() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(objectMap.getLocator("paas.excendspace.memfloat"));
        return element;
    }
    //返回空间管理页面-空间扩容窗口中“保存”按钮页面元素对象
    public WebElement savebutton() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(objectMap.getLocator("paas.excendspace.savebutton"));
        return element;
    }
    //返回空间管理页面-空间扩容窗口中“取消”按钮页面元素对象
    public WebElement cancelbutton() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(objectMap.getLocator("paas.excendspace.cancelbutton"));
        return element;
    }
    //返回空间管理页面-空间扩容窗口中右上角“X”按钮页面元素对象
    public WebElement Xbutton() throws Exception{
        //调用ObjectMap中的getLocator方法获取配置文件中关于用户名的定位方式和定位表达式
        element = driver.findElement(objectMap.getLocator("paas.excendspace.Xbutton"));
        return element;
    }
    @Test
    public void unittestSpaceManagement(){

    }
}

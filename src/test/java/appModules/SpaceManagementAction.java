package appModules;

import Util.Log;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import static propertyFiles.Constants.Spacemanagement_Main;


public class SpaceManagementAction {
    static {
        //指定log4j配置文件为log4j.xml
        DOMConfigurator.configure("log4j.xml");
    }
    public static void linkToSpaceManagementPage(WebDriver driver) throws Exception {
        driver.get(Spacemanagement_Main);
        Log.info("进入空间管理页面...");
    }
}

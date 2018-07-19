package appModules;

import Util.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.MainPage;
import pageObjects.Navigation;
import static Util.KeyActionsUtil.sleep;
import static Util.WaitElementUntil.waitWebElement;
import static propertyFiles.Elements.paas_landPage_controller;
import static propertyFiles.Elements.paas_navigation_resources;
import static propertyFiles.Elements.paas_resources_spacemanagement;

public class SpaceManagementAction {
    public static void linkToSpaceManagementPage(WebDriver driver) throws Exception {
        MainPage mainPage = new MainPage(driver);
        Navigation navigation = new Navigation(driver);
        waitWebElement(driver,paas_landPage_controller);
        Log.info("等待控制台连接出现...");
        //WaitFor_Element("paas.landPage.controller");
        mainPage.controller().click();
        sleep("1000");
        driver.navigate().refresh();
        Log.info("进入控制台...");
        waitWebElement(driver,paas_navigation_resources);
        //WaitFor_Element("paas.navigation.resources");
        Log.info("等待导航出现...");
        navigation.resouces().click();
        waitWebElement(driver,paas_resources_spacemanagement);
        Log.info("等待空间管理入口...");
        navigation.spacemanagement().click();
        Log.info("进入空间管理页面...");
    }
}

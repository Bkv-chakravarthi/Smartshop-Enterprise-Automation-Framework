package com.smartshop.framework.driver;

import com.smartshop.framework.config.ConfigurationManager;
import org.openqa.selenium.WebDriver;

public class DriverController {
    private DriverController() {}

    public static void initDriver() {
        boolean runWithGrid = ConfigurationManager.getAppconfig().runWithGrid();


        WebDriver driver;

        if (runWithGrid) {
            driver = RemoteDriverFactory.createRemoteDriver();
        } else {
            driver = LocalDriverFactory.createLocalDriver();
        }

        DriverManager.setDriver(driver);
    }

    public static void quitDriver() {
        WebDriver driver = DriverManager.getDriver();
        if (driver != null) {
            driver.quit();
            DriverManager.unload();
        }
    }
}
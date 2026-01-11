package com.smartshop.framework.Base;

import com.smartshop.framework.config.ConfigurationManager;
import com.smartshop.framework.driver.DriverController;
import com.smartshop.framework.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        DriverController.initDriver();
        DriverManager.getDriver().get(ConfigurationManager.getAppconfig().baseurl());
    }

    @AfterMethod
    public void tearDown() {
        DriverController.quitDriver();
    }
}

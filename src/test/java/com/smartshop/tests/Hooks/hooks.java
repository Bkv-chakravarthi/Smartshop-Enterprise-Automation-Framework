package com.smartshop.tests.Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import com.smartshop.framework.driver.LocalDriverFactory;
import com.smartshop.framework.driver.DriverManager;

public class hooks {

    @Before
    public void setUp() {
        DriverManager.setDriver(
                LocalDriverFactory.createLocalDriver()
        );
    }

    @After
    public void tearDown() {
        DriverManager.quitDriver();
    }
}


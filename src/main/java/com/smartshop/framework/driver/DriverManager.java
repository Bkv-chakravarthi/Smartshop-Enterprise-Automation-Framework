package com.smartshop.framework.driver;

import org.openqa.selenium.WebDriver;

public final class DriverManager {
    private DriverManager(){}
    private  static  ThreadLocal<WebDriver> driver  =  new ThreadLocal<>(); //why we are using this line ?
    public static WebDriver getDriver(){
        return driver.get();
    }
    public static void setDriver(WebDriver driverRef) {
        driver.set(driverRef);
    }  // why we are setting and getting we can use lambok here? why not?
    static  void unload(){
        driver.remove();
    }

    public static void quitDriver() {
        WebDriver driver = DriverManager.getDriver();
        if (driver != null) {
            driver.quit();
            DriverManager.unload();
        }
    }
}

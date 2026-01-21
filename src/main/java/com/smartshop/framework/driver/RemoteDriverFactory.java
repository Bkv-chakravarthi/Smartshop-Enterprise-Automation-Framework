package com.smartshop.framework.driver;

import com.smartshop.framework.config.ConfigurationManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public final class RemoteDriverFactory {
    private RemoteDriverFactory(){}
    public static WebDriver createRemoteDriver(){
        try{
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximozed");
            URL gridUrl = ConfigurationManager.getAppconfig().gridHubURL();
        return new RemoteWebDriver(gridUrl , options);
        }catch (Exception e ){
            throw new RuntimeException("failed to create remote driver " , e);
        }
    }

}

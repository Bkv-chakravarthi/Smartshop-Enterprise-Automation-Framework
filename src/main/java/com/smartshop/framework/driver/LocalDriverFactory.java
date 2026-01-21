package com.smartshop.framework.driver;

import com.smartshop.framework.config.ConfigurationManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public final class LocalDriverFactory {
    private  LocalDriverFactory (){}
    public static WebDriver createLocalDriver() {
        String browser = ConfigurationManager.getAppconfig().browser().toUpperCase();
        WebDriver driver;
        switch (browser) {
            case "CHROME":
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--start-maximozed");
                driver = new ChromeDriver(options);
                break;

            default:
                throw new RuntimeException("Unsupported browser : " + browser);
        }
        return driver;

        
    }
}

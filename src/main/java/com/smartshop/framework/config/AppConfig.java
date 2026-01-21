package com.smartshop.framework.config;

import org.aeonbits.owner.Config;

import java.net.URL;

@Config.Sources ({
        "system:properties" ,
        "file:src/test/resources/config/config.properties" ,
        "system:env"
})
public interface AppConfig extends Config {
    String env();
    @DefaultValue("https://www.demoblaze.com")
    String baseurl();
    @DefaultValue("chrome")
    String browser();
    @DefaultValue("false")
    boolean runWithGrid();
    @DefaultValue("http://localhost:444/wd/hub")
    URL gridHubURL();
}

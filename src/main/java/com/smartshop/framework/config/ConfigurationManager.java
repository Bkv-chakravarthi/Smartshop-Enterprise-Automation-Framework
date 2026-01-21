package com.smartshop.framework.config;

import org.aeonbits.owner.ConfigFactory;

public class ConfigurationManager {
    private static  final AppConfig appconfig = ConfigFactory.create(AppConfig.class);
    public static  final AppConfig getAppconfig(){
        return appconfig;
    }



}

package com.company.infrastructure.config;

/**
 * Created by Andrey on 02.04.2017.
 */
public class ConfigurationManager {

    private static final String TEST_BROWSER = "testBrowser";
    private static final String RUN_ON = "runOn";
    private static final String TEST_ENV= "test-env";

    private static final String MOBILE_PLATFORM = "mobilePlatform";

    private static ConfigurationManager instance = null;

    public static ConfigurationManager getInstance(){
   if (instance ==null)
       instance = new ConfigurationManager();
   return instance;
    }

    private ConfigurationManager(){

    }

    public String getTestBrowser(){
        return getEnvironmentVariableOrDefault("testBrowser", "chrome");
    }

    public String getTestEnv(){
        return getEnvironmentVariableOrDefault("testEnv", "production");
    }

    public String getMobilePlatform(){return getEnvironmentVariableOrDefault("mobilePlatform","ios");}

    public String getRunOn(){return getEnvironmentVariableOrDefault("runOn","LOCAL");}

    private String getEnvironmentVariableOrDefault(String envVar, String defaultValue){
        return System.getenv(envVar) != null ? System.getenv(envVar) : defaultValue;
    }

}

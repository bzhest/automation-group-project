package com.company.infrastructure.webDriverManager;

import com.company.infrastructure.config.ConfigurationManager;
import com.company.infrastructure.webDriverManager.api.WebDriverFactory;
import com.company.infrastructure.webDriverManager.api.WebDriverManager;
import com.company.infrastructure.webDriverManager.enums.RunOn;

/**
 * Created by Andrey on 22.04.2017.
 */
public class DefaultWebDriverManager implements WebDriverManager {


    public  String getWebDriver(){
        RunOn runOn = RunOn.fromString(ConfigurationManager.getInstance().getRunOn().toUpperCase());
        WebDriverFactory factory;

        switch(runOn){
            case LOCAL:
                factory = new LocalWebDriverFactory();
                break;
            case CLOUD:
                factory = new CloudWebDriverFactory();
                break;
            case BUILDSERVER:
                factory = new BuildServerWebDriverFactory();
                break;
            default: throw new RuntimeException("No such env");
        }
        return factory.create();
    }

    public void destroyWebDriver(String driver){
        System.out.println("Quiting driver " + driver);
    }
}

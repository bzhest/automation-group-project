package com.company.infrastructure.webDriverManager;

import com.company.infrastructure.config.ConfigurationManager;
import com.company.infrastructure.webDriverManager.api.WebDriverFactory;
import com.company.infrastructure.webDriverManager.enums.BrowsersTypes;

/**
 * Created by Andrey on 22.04.2017.
 */
public class BuildServerWebDriverFactory implements WebDriverFactory {
    public  String create(){
        //String browser = ConfigurationManager.getInstance().getTestEnv().toUpperCase();
        BrowsersTypes browsersTypes = BrowsersTypes.fromString(ConfigurationManager.getInstance().getTestEnv().toUpperCase());


        switch(browsersTypes){
            case CHROME: return "new server ChromeDriver";
            case MOZILLA: return "new server MozillaDriver";
            case SAFARI: return "new server SafariDriver";
            default: return "no such browser";
        }
    }

    public void destroyWebDriver(){

    }
}

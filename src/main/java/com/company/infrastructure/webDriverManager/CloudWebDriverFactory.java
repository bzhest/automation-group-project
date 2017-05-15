package com.company.infrastructure.webDriverManager;

import com.company.infrastructure.config.ConfigurationManager;
import com.company.infrastructure.webDriverManager.api.WebDriverFactory;
import com.company.infrastructure.webDriverManager.enums.BrowsersTypes;

/**
 * Created by Andrey on 22.04.2017.
 */
public class CloudWebDriverFactory implements WebDriverFactory {
    public  String create(){
        //String browser = ConfigurationManager.getInstance().getTestEnv().toUpperCase();
        BrowsersTypes browsersTypes = BrowsersTypes.fromString(ConfigurationManager.getInstance().getTestEnv().toUpperCase());

        switch(browsersTypes){
            case CHROME: return "new cloud ChromeDriver";
            case MOZILLA: return "new cloud MozillaDriver";
            case SAFARI: return "new cloud SafariDriver";
            default: return "no such browser";
        }
    }

    public void destroyWebDriver(){

    }
}

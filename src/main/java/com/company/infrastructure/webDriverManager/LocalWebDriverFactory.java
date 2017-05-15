package com.company.infrastructure.webDriverManager;

import com.company.infrastructure.config.ConfigurationManager;
import com.company.infrastructure.webDriverManager.api.WebDriverFactory;
import com.company.infrastructure.webDriverManager.enums.BrowsersTypes;

/**
 * Created by Andrey on 23.04.2017.
 */
public class LocalWebDriverFactory implements WebDriverFactory {
    @Override
    public String create() {
        //String browser = ConfigurationManager.getInstance().getTestBrowser().toUpperCase();
        BrowsersTypes browsersTypes = BrowsersTypes.fromString(ConfigurationManager.getInstance().getTestBrowser().toUpperCase());

        switch (browsersTypes) {
            case CHROME:
                return "new local  ChromeDriver()";
                //return new Chrome driver
            case MOZILLA:
                return "new  local MozillaDriver";
            case SAFARI:
                return "new local SafariDriver";
            case IE:
                return "new local IE";
            default:
                throw new RuntimeException("No such browser");
        }
    }
}

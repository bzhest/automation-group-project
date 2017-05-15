package com.company.infrastructure.webDriverManager.enums;

/**
 * Created by Andrey on 27.04.2017.
 */
public enum BrowsersTypes {
    CHROME,
    MOZILLA,
    IE,
    SAFARI;

    public  static BrowsersTypes fromString (String type){
        return valueOf(type.toUpperCase());
    }
}

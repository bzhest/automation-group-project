package com.company.infrastructure.webDriverManager.enums;

/**
 * Created by Andrey on 27.04.2017.
 */
public enum RunOn {
    LOCAL,
    CLOUD,
    BUILDSERVER;

    public static RunOn fromString (String runOn){
        return valueOf(runOn.toUpperCase());
    }
}

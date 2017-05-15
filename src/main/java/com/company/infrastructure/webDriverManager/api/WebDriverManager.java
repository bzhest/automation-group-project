package com.company.infrastructure.webDriverManager.api;

/**
 * Created by Andrey on 22.04.2017.
 */
public interface WebDriverManager {
    String getWebDriver();
    void destroyWebDriver(String driver);
}

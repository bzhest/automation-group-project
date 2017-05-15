package com.company.infrastructure.base;

import com.company.infrastructure.logger.FileTestLogger;
import com.company.infrastructure.logger.api.TestLogger;
import com.company.infrastructure.webDriverManager.api.WebDriverManager;


/**
 * Created by Andrey on 06.04.2017.
 */
public class TestBase {

    protected TestLogger logger;

    public void setUp(){
        logger =new FileTestLogger();
        beforeTest();
    }

    public void tearDown(){
        afterTest();
    }
    protected void beforeTest(){}
    protected void afterTest(){}

}

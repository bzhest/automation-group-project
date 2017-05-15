package com.company.infrastructure.logger;

import com.company.infrastructure.base.TestBase;

/**
 * Created by Andrey on 13.04.2017.
 */
public class Test2app extends TestBase {
    @Override
    protected void beforeTest() {
        super.beforeTest();
        logger.log("");
        System.out.println("Open my site www.adreyb.ixloo.com");
    }
    //Test
    public void Sometest(){
        logger.log("-----");
        logger.log("Step1");
        logger.log("Step2");
        logger.log("Step2");
        logger.log("Step3");
        logger.log("Step4");

    }
}

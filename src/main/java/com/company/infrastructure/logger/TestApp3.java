package com.company.infrastructure.logger;

import com.company.infrastructure.logger.api.TestLogger;

/**
 * Created by Andrey on 13.04.2017.
 */
public class TestApp3 {
    public static void main(String[] args) {
        TestLogger testLogger = new StdTestLogger();
        TestLogger pp = new FileTestLogger();
        /*testLogger.log("step 1");
        testLogger.log("step 2");
        testLogger.log("step 3");
        testLogger.log("step 4");
        testLogger.log("step 5");
        pp.log("step 6");*/
        TestLogger loger = getLogger("STD");
        loger.log("step 7");
    }

        public static TestLogger getLogger(String type){
        return type.equals("STD") ? new StdTestLogger(): new FileTestLogger();
        }


}

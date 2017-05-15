package com.company.infrastructure.logger;

import com.company.infrastructure.logger.api.TestLogger;

/**
 * Created by Andrey on 13.04.2017.
 */
public class Testappp {
    public static void main(String[] args) {
        TestLogger log = new TestLogger() {
            @Override
            public void log(String msg) {
                System.out.println(msg);
            }
        };
    }
}

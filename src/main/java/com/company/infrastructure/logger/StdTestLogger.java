package com.company.infrastructure.logger;

import com.company.infrastructure.logger.api.TestLogger;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Andrey on 13.04.2017.
 */
public class StdTestLogger implements TestLogger {
    private static int  stepCounter = 1;

    @Override
    public void log(String msg) {
        String curProcess = Thread.currentThread().getName();
        System.out.println(stepCounter + ")" +currentTime() + " [" + curProcess + "] " + msg);
        stepCounter++;
    }
    protected String currentTime(){
        SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
        return sdf.format(new Date());
    }
}

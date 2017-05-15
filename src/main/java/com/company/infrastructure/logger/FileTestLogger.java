package com.company.infrastructure.logger;

import com.company.infrastructure.logger.api.TestLogger;

import java.io.FileWriter;

/**
 * Created by Andrey on 13.04.2017.
 */
public class FileTestLogger implements TestLogger {
    @Override
    public void log(String msg) {
        try {
            FileWriter file = new FileWriter("report.txt",true);
            file.append(System.lineSeparator() + msg);
            file.close();

        }catch (Exception ex){

        }
    }
}

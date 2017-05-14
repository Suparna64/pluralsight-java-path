package com.jcsanchez.testing.m6;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

/**
 * Created by jsssn on 14-May-17.
 */
public class ApplicationRunner {

    public String run(String inputFile) {
        ByteArrayOutputStream dummyOutput = new ByteArrayOutputStream();
        SalesReportRunner app = new SalesReportRunner(new PrintStream(dummyOutput));
        app.run(inputFile);

        try {
            return dummyOutput.toString("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}

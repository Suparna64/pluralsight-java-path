package com.jcsanchez.testing.m6;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

/**
 * Created by jsssn on 14-May-17.
 */
public class SalesReportSystemTest {

    @Test
    public void shouldPrintStoreReportForSampleData() {
        ApplicationRunner runner = new ApplicationRunner();

        String report = runner.run("src/main/resources/example-sales.csv");

        assertThat(report, containsString("- London          -    235 -"));
    }
}

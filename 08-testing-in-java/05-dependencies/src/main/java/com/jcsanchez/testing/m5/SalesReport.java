package com.jcsanchez.testing.m5;

import java.io.PrintStream;
import java.time.LocalDate;
import java.util.Map;

/**
 * Created by jsssn on 14-May-17.
 */
public class SalesReport {

    private final PrintStream output;
    private final SalesAnalysisService analyser;

    public SalesReport(PrintStream output, SalesAnalysisService analyser) {
        this.output = output;
        this.analyser = analyser;
    }

    public void report() {
        output.printf("\nSales Report for %s\n%n", LocalDate.now());

        printTable("Store Sales", analyser.tallyStoreSales());
        printTable("Product Sales", analyser.tallyProductSales());
    }

    private void printTable(String title, Map<String, Integer> values) {
        output.printf("---------- %s ----------%n", title);
        printRow(title, "Value");
        values.forEach((key, value) -> printRow(key, "" + value));
        output.println();
        output.println();
    }

    private void printRow(String first, String second) {
        output.printf("- %-15s - %6.6s -%n", first, second);
    }
}

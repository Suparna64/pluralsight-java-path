package com.jcsanchez.testing.m5;

import com.opencsv.CSVReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jsssn on 14-May-17.
 */
public class CsvSalesRepository implements SalesRepository {

    private final String fileLocation;
    private PrintStream error;
    private List<Sale> sales;

    public CsvSalesRepository(String fileLocation) {
        this.fileLocation = fileLocation;
        error = System.out;
    }

    public void setError(PrintStream error) {
        this.error = error;
    }

    private int parseInt(String value) {
        return Integer.parseInt(value.trim());
    }

    @Override
    public List<Sale> loadSales() {
        if (sales == null) {
            sales = new ArrayList<>();
            final File file = new File(fileLocation);

            if (!file.exists() || !file.canRead() || !file.isFile()) {
                System.err.println("Unable to find readable file: " + file.getAbsolutePath());
            }

            try (CSVReader reader = new CSVReader(new FileReader(fileLocation))) {
                String[] nextLine;
                while ((nextLine = reader.readNext()) != null) {
                    String product = nextLine[0].trim();
                    String store = nextLine[1].trim();
                    int number = parseInt(nextLine[2]);
                    int pricePerItem = parseInt(nextLine[3]);

                    sales.add(new Sale(product, store, number, pricePerItem));
                }

                return sales;
            } catch (IOException e) {
                e.printStackTrace(error);
                return null;
            }
        }

        return sales;
    }
}

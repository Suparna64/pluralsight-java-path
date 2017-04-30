package com.jcsanchez.collections.maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by jsssn on 30-Apr-17.
 */
public class LookupTableComparison {
    private static final int ITERATIONS = 5;
    private static final int NUMBER_OF_PRODUCTS = 20_000;

    private static final List<Product> products = generateProducts();

    public static void main(String[] args) {
        runLookups(new MapsProductLookupTable());
        runLookups(new NaiveProductLookupTable());
    }

    private static List<Product> generateProducts() {
        final List<Product> products = new ArrayList<>();
        final Random weightGenerator = new Random();

        for (int i = 0; i < NUMBER_OF_PRODUCTS; i++) {
            products.add(new Product(i, "Product" + i, 10 + weightGenerator.nextInt(10)));
        }

        Collections.shuffle(products);
        Collections.shuffle(products);
        Collections.shuffle(products);

        return products;
    }

    private static void runLookups(final ProductLookupTable lookupTable) {
        final List<Product> products = LookupTableComparison.products;
        System.out.println("Running lookups with " + lookupTable.getClass().getSimpleName());

        for (int i = 0; i < ITERATIONS; i++) {
            final long startTime = System.currentTimeMillis();

            for (Product product : products) {
                lookupTable.addProduct(product);
            }

            for (Product product : products) {
                final Product result = lookupTable.lookupById(product.getId());
                if (result != product) {
                    throw new IllegalStateException("Lookup Table returned wrong result for " + product.getName());
                }
            }

            lookupTable.clear();

            System.out.println(System.currentTimeMillis() - startTime + "ms");
        }
    }
}

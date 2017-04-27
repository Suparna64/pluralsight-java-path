package com.jcsanchez.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by jsssn on 25-Apr-17.
 */
public class ProductCatalogue implements Iterable<Product> {

    private final Set<Product> products = new HashSet<>();

    public void isSuppliedBy(Supplier supplier) {
        products.addAll(supplier.products());
    }

    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
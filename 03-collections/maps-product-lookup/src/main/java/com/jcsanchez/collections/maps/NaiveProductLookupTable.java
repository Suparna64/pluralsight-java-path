package com.jcsanchez.collections.maps;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jsssn on 30-Apr-17.
 */
public class NaiveProductLookupTable implements ProductLookupTable{
    private List<Product> products = new ArrayList<>();

    @Override
    public Product lookupById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }

        return null;
    }

    @Override
    public void addProduct(Product productToAdd) {
        for (Product product : products) {
            if (product.getId() == productToAdd.getId()) {
                throw new IllegalArgumentException("Unable to add product, duplicate id for "
                        + productToAdd);
            }
        }

        products.add(productToAdd);
    }

    @Override
    public void clear() {
        products.clear();
    }
}

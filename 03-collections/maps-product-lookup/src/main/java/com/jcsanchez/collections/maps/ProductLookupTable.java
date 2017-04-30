package com.jcsanchez.collections.maps;

/**
 * Created by jsssn on 30-Apr-17.
 */
public interface ProductLookupTable {
    Product lookupById(int id);

    void addProduct(Product productToAdd);

    void clear();
}

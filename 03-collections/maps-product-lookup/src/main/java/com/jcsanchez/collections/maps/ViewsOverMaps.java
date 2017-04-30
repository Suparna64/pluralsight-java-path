package com.jcsanchez.collections.maps;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by jsssn on 30-Apr-17.
 */
public class ViewsOverMaps {
    public static void main(String[] args) {
        final Map<Integer, Product> idToProducts = new HashMap<>();

        idToProducts.put(1, ProductFixtures.door);
        idToProducts.put(2, ProductFixtures.floorPanel);
        idToProducts.put(3, ProductFixtures.window);

        System.out.println(idToProducts);
        System.out.println();

        final Set<Integer> ids = idToProducts.keySet();
        System.out.println(ids);
        System.out.println();

        ids.remove(1);
        System.out.println(ids);
        System.out.println(idToProducts);
        System.out.println();

        // ids.add(4)  <-- Can't do this because what value to add???

        final Collection<Product> products = idToProducts.values();
        System.out.println(products);
        System.out.println();

        products.remove(ProductFixtures.floorPanel);
        System.out.println(products);
        System.out.println(idToProducts);
        System.out.println();

        // products.add(ProductFixtures.floorPanel);   <-- Throws error like above

        final Set<Map.Entry<Integer, Product>> entries = idToProducts.entrySet();
        for (Map.Entry<Integer, Product> entry : entries) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
            entry.setValue(ProductFixtures.floorPanel);
        }

        System.out.println(idToProducts);
    }
}

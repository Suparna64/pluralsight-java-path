package com.jcsanchez.collections.maps;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jsssn on 30-Apr-17.
 */
public class Java8Enhancements {
    public static void main(String[] args) {
        final Product defaultProduct = new Product(-1, "Whatever the customer wants", 100);

        final Map<Integer, Product> idToProduct = new HashMap<>();

        idToProduct.put(1, ProductFixtures.door);
        idToProduct.put(2, ProductFixtures.floorPanel);
        idToProduct.put(3, ProductFixtures.window);

        System.out.println(idToProduct);

        idToProduct.replaceAll((id, oldProduct) ->
            new Product(id, oldProduct.getName(), oldProduct.getWeight() + 10));

        System.out.println(idToProduct);
        System.out.println();

        Product result = idToProduct
                .computeIfAbsent(10, (id) -> new Product(id, "Custom Product", 10));
        System.out.println(result);
        System.out.println(idToProduct.get(10));
        System.out.println();

        System.out.println("ForEach Example");
        idToProduct.forEach((key, value) -> {
            System.out.println(key + " -> " + value);
        });
    }
}

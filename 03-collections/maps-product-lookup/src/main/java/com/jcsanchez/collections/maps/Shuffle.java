package com.jcsanchez.collections.maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by jsssn on 30-Apr-17.
 */
public class Shuffle {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(ProductFixtures.door);
        products.add(ProductFixtures.floorPanel);
        products.add(ProductFixtures.window);

        System.out.println(products);

        Collections.shuffle(products);
        System.out.println(products);

        Collections.shuffle(products);
        System.out.println(products);

        Collections.shuffle(products);
        System.out.println(products);
    }
}

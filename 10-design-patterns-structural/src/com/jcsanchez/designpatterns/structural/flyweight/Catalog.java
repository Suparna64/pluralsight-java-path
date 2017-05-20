package com.jcsanchez.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jsssn on 19-May-17.
 */
public class Catalog {
    private Map<String, Item> items = new HashMap<>();

    // Factory method
    public Item lookup(String itemName) {
        if (!items.containsKey(itemName)) {
            items.put(itemName, new Item(itemName));
        }

        return items.get(itemName);
    }

    public int totalItemsMade() {
        return items.size();
    }
}

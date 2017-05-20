package com.jcsanchez.designpatterns.structural.flyweight;

/**
 * Created by jsssn on 19-May-17.
 */
public class Item {
    private final String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

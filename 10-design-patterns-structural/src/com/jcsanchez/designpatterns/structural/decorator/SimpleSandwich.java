package com.jcsanchez.designpatterns.structural.decorator;

/**
 * Created by jsssn on 19-May-17.
 */
public class SimpleSandwich implements Sandwich {

    @Override
    public String make() {
        return "Bread";
    }
}

package com.jcsanchez.designpatterns.structural.decorator;

/**
 * Created by jsssn on 19-May-17.
 */
public class DressingDecorator extends SandwichDecorator {

    public DressingDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return customSandwich.make() + addDressing();
    }

    private String addDressing() {
        return " + mustard";
    }
}

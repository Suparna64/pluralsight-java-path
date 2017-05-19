package com.jcsanchez.designpatterns.structural.decorator;

/**
 * Created by jsssn on 19-May-17.
 */
public class MeatDecorator extends SandwichDecorator {

    public MeatDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return customSandwich.make() + addMeat();
    }

    private String addMeat() {
        return " + turkey";
    }
}

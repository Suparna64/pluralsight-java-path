package com.jcsanchez.designpatterns.structural.decorator;

/**
 * Created by jsssn on 19-May-17.
 */
public class DecoratorSandwichDemo {

    public static void main(String[] args) {
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));

        System.out.println(sandwich.make());
    }
}

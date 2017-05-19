package com.jcsanchez.designpatterns.structural.bridge.Shape2;

/**
 * Created by jsssn on 18-May-17.
 */
public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}

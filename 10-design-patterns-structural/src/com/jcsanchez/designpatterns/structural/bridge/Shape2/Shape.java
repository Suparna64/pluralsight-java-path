package com.jcsanchez.designpatterns.structural.bridge.Shape2;

/**
 * Created by jsssn on 18-May-17.
 */
public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();
}

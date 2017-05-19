package com.jcsanchez.designpatterns.structural.bridge.Shape2;

/**
 * Created by jsssn on 18-May-17.
 */
public class Red implements Color {

    @Override
    public void applyColor() {
        System.out.println("Applying red color");
    }
}

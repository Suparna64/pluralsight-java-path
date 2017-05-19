package com.jcsanchez.designpatterns.structural.bridge.Shape1;

/**
 * Created by jsssn on 18-May-17.
 */
public class Shape1BridgeDemo {

    public static void main(String[] args) {

        Circle circle = new BlueCircle();

        Square square = new RedSquare();

        circle.applyColor();
        square.applyColor();
    }
}

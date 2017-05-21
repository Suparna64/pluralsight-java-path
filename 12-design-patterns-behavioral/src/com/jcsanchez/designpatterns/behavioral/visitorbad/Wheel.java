package com.jcsanchez.designpatterns.behavioral.visitorbad;

/**
 * Created by jsssn on 20-May-17.
 */
public class Wheel implements AtvPart {

    @Override
    public double calculateShipping() {
        return 12;
    }
}

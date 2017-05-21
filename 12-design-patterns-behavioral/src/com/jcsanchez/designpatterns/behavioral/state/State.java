package com.jcsanchez.designpatterns.behavioral.state;

/**
 * Created by jsssn on 20-May-17.
 */
public abstract class State {

    public void handleRequest() {
        System.out.println("Shouldn't be able to get here.");
    }
}

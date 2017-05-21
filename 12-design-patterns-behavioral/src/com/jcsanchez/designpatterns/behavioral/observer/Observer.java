package com.jcsanchez.designpatterns.behavioral.observer;

/**
 * Created by jsssn on 20-May-17.
 */
public abstract class Observer {
    protected Subject subject;
    abstract void update();
}

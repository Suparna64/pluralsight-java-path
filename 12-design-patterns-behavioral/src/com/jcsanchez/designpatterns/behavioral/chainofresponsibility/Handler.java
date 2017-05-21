package com.jcsanchez.designpatterns.behavioral.chainofresponsibility;

/**
 * Created by jsssn on 20-May-17.
 */
public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);
}

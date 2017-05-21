package com.jcsanchez.designpatterns.behavioral.chainofresponsibility;

/**
 * Created by jsssn on 20-May-17.
 */
public class CEO extends Handler {

    @Override
    public void handleRequest(Request request) {
        System.out.println("CEOs can approve anything they want");
    }
}

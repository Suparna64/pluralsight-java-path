package com.jcsanchez.designpatterns.behavioral.chainofresponsibility;

/**
 * Created by jsssn on 20-May-17.
 */
public class Director extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.CONFERENCE) {
            System.out.println("Directors can approve conferences");
        } else {
            successor.handleRequest(request);
        }
    }
}

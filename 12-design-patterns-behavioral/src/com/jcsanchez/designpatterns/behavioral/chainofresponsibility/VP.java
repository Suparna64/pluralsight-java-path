package com.jcsanchez.designpatterns.behavioral.chainofresponsibility;

/**
 * Created by jsssn on 20-May-17.
 */
public class VP extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.PURCHASE) {
            if (request.getAmount() < 1500) {
                System.out.println("VPs can approve purchase below 1500");
            } else {
                successor.handleRequest(request);
            }
        }
    }
}

package com.jcsanchez.designpatterns.behavioral.chainofresponsibility;

/**
 * Created by jsssn on 20-May-17.
 */
public class Request {

    private RequestType requestType;
    private double amount;

    public Request(RequestType requestType, double amount) {
        this.requestType = requestType;
        this.amount = amount;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public double getAmount() {
        return amount;
    }
}

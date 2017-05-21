package com.jcsanchez.designpatterns.behavioral.state;

/**
 * Created by jsssn on 20-May-17.
 */
public class FanLowState extends State {

    private Fan fan;

    public FanLowState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to med");
        fan.setState(fan.getFanMedState());
    }

    @Override
    public String toString() {
        return "Fan is low.";
    }
}
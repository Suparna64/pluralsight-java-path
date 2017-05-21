package com.jcsanchez.designpatterns.behavioral.state;

/**
 * Created by jsssn on 20-May-17.
 */
public class StateDemo {

    public static void main(String[] args) {
        Fan fan = new Fan();

        System.out.println(fan);

        fan.pullChain();
        System.out.println(fan);

        fan.pullChain();
        System.out.println(fan);

        fan.pullChain();
        System.out.println(fan);

        fan.pullChain();
        System.out.println(fan);
    }
}

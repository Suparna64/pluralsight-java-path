package com.jcsanchez.concurrency.runnable;

/**
 * Created by jsssn on 07-May-17.
 */
public class FirstRunnable {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("I am running in " + Thread.currentThread().getName());
        };

        Thread t = new Thread(runnable);
        t.setName("My thread");

        t.start();
        // t.run(); // Nope, wrong method
    }
}

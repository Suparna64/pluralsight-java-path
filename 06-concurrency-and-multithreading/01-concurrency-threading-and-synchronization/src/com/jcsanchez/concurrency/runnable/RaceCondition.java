package com.jcsanchez.concurrency.runnable;

/**
 * Created by jsssn on 07-May-17.
 */
public class RaceCondition {

    public static void main(String[] args) throws InterruptedException {
        LongWrapper longWrapper = new LongWrapper(0L);

        Runnable runnable = () -> {

            for (int i = 0; i < 1_000; i++) {
                longWrapper.incrementValue();
            }
        };

        Thread[] threads = new Thread[1_000];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(runnable);
            threads[i].start();
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }

        System.out.println("Value = " + longWrapper.getValue());
    }
}

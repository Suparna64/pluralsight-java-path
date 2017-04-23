package com.jcsanchez.exercise.banking;

/**
 * Created by jsssn on 23-Apr-17.
 */
public class Worker implements Runnable {
    private BankAccount account;

    public Worker(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (account) {
                int startBalance = account.getBalance();
                account.deposit(10);
                int endBalance = account.getBalance();

                System.out.printf("Start: %-5d End: %-5d \n", startBalance, endBalance);
            }
        }
    }
}

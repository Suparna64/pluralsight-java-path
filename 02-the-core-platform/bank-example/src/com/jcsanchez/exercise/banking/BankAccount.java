package com.jcsanchez.exercise.banking;

/**
 * Created by jsssn on 23-Apr-17.
 */
public class BankAccount {
    private int balance;

    public BankAccount(int startBalance) {
        balance = startBalance;
    }

    public synchronized int getBalance() {
        return balance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
    }

    public synchronized void withdrawal(int amount) {
        balance -= amount;
    }
}

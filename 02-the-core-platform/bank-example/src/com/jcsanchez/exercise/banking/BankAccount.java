package com.jcsanchez.exercise.banking;

/**
 * Created by jsssn on 23-Apr-17.
 */
public class BankAccount {
    private final String id;
    private int balance;

    public BankAccount(String id) {
        this.id = id;
    }

    public BankAccount(String id, int startBalance) {
        this(id);
        balance = startBalance;
    }

    public String getId() {
        return id;
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

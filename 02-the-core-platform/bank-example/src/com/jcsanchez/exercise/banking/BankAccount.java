package com.jcsanchez.exercise.banking;

/**
 * Created by jsssn on 23-Apr-17.
 */
public class BankAccount {
    private int balance;

    public BankAccount(int startBalance) {
        balance = startBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }
}

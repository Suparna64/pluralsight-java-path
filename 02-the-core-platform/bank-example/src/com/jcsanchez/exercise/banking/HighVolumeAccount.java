package com.jcsanchez.exercise.banking;

/**
 * Created by jsssn on 23-Apr-17.
 */
public final class HighVolumeAccount extends BankAccount implements Runnable {
    public HighVolumeAccount(String id) {
        super(id);
    }

    public HighVolumeAccount(String id, int balance) {
        super(id, balance);
    }

    private int[] readDailyDeposits() {
        return new int[]{10, 20, 30};
    }

    private int[] readDailyWithdrawals() {
        return new int[]{5, 10};
    }

    public void run() {
        for (int depoditAmt : readDailyDeposits()) {
            deposit(depoditAmt);
        }

        for (int withdrawalAmt : readDailyWithdrawals()) {
            withdrawal(withdrawalAmt);
        }
    }
}

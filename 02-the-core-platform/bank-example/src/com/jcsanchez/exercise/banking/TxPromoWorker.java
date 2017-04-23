package com.jcsanchez.exercise.banking;

/**
 * Created by jsssn on 23-Apr-17.
 */
public class TxPromoWorker extends TxWorker {
    public TxPromoWorker(BankAccount account, char txType, int amt) {
        super(account, txType, amt);
    }

    @Override
    public void run() {
        if (txType == 'w') {
            System.out.printf("Withdrawing %d\n", amt);
            account.withdrawal(amt);
        } else if (txType == 'd') {
            synchronized (account) {
                System.out.printf("Depositing %d\n", amt);
                account.deposit(amt);
                if (account.getBalance() > 500) {
                    int bonus = (int) ((account.getBalance() - 500) * 0.1);
                    System.out.printf("Bonus! %d\n", bonus);
                    account.deposit(bonus);
                }
            }
        }
    }
}

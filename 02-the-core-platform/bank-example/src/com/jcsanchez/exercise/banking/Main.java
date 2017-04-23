package com.jcsanchez.exercise.banking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
//        workerExample();
//        txWorkerExample();
        txPromoWorkerExample();


    }

    private static void txPromoWorkerExample() {
        ExecutorService es = Executors.newFixedThreadPool(5);
        BankAccount account = new BankAccount(460);
        TxWorker[] workers = new TxWorker[3];

        workers[0] = new TxPromoWorker(account, 'd', 50);
        workers[1] = new TxPromoWorker(account, 'w', 100);
        workers[2] = new TxPromoWorker(account, 'd', 20);

        for (TxWorker worker : workers) {
            es.submit(worker);
        }

        try {
            es.shutdown();
            es.awaitTermination(60, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("Final Balance: %d\n", account.getBalance());
    }

    private static void txWorkerExample() {
        ExecutorService es = Executors.newFixedThreadPool(5);
        BankAccount account = new BankAccount(1000);
        TxWorker[] workers = new TxWorker[3];

        workers[0] = new TxWorker(account, 'd', 50);
        workers[1] = new TxWorker(account, 'w', 100);
        workers[2] = new TxWorker(account, 'd', 20);

        for (TxWorker worker : workers) {
            es.submit(worker);
        }

        try {
            es.shutdown();
            es.awaitTermination(60, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void workerExample() {
        ExecutorService es = Executors.newFixedThreadPool(5);
        BankAccount account = new BankAccount(100);

        for (int i = 0; i < 5; i++) {
            Worker worker = new Worker(account);
            es.submit(worker);
        }

        try {
            es.shutdown();
            es.awaitTermination(60, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
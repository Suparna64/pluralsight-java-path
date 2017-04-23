package com.jcsanchez.exercise.banking;

import java.lang.reflect.Modifier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
//        workerExample();
//        txWorkerExample();
//        txPromoWorkerExample();

        HighVolumeAccount acct = new HighVolumeAccount("1234");
        doWork(acct);
        classInfo(acct);
        typeModifier(acct);
    }

    private static void doWork(Object obj) {
        Class<?> c = obj.getClass();
        showName(c);
    }

    private static void showName(Class<?> theClass) {
        System.out.println(theClass.getSimpleName());
    }

    private static void classInfo(Object object) {
        Class<?> theClass = object.getClass();
        System.out.println(theClass.getSimpleName());

        Class<?> superClass = theClass.getSuperclass();
        System.out.println(superClass.getSimpleName());

        Class<?>[] interfaces = theClass.getInterfaces();
        for (Class<?> classInterface : interfaces) {
            System.out.println(classInterface.getSimpleName());
        }
    }

    private static void typeModifier(Object object) {
        Class<?> theClass = object.getClass();

        int modifiers = theClass.getModifiers();

        if ((modifiers & Modifier.FINAL) > 0) {
            System.out.println("bitwise check - final");
        }

        if (Modifier.isFinal(modifiers)) {
            System.out.println("method check - final");
        }
    }

    private static void txPromoWorkerExample() {
        ExecutorService es = Executors.newFixedThreadPool(5);
        BankAccount account = new BankAccount("123", 460);
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
        BankAccount account = new BankAccount("123", 1000);
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
        BankAccount account = new BankAccount("123", 100);

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
package com.jcsanchez.exercise.adder;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        String[] inFiles = {"./file1.txt", "./file2.txt", "./file3.txt", "./file4.txt", "./file5.txt", "./file6.txt"};
        String[] outFiles = {"./file1out.txt", "./file2out.txt", "./file3out.txt",
                             "./file4out.txt", "./file5out.txt", "./file6out.txt"};
        ExecutorService es = Executors.newFixedThreadPool(3);
        Future<Integer>[] results = new Future[inFiles.length];

        for (int i = 0; i < inFiles.length; i++) {
            Adder adder = new Adder(inFiles[i], outFiles[i]);
            results[i] = es.submit(adder);
        }

        for (Future<Integer> result : results) {
            try {
                int value = result.get();
                System.out.println("Total: " + value);
            } catch (ExecutionException e) {
                Throwable adderEx = e.getCause();
                System.out.println(adderEx.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            es.shutdown();
            es.awaitTermination(60, TimeUnit.SECONDS);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

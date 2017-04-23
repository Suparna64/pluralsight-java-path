package com.jcsanchez.exercise.adder;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String[] inFiles = {"./file1.txt", "./file2.txt", "./file3.txt", "./file4.txt", "./file5.txt", "./file6.txt"};
        String[] outFiles = {"./file1out.txt", "./file2out.txt", "./file3out.txt",
                             "./file4out.txt", "./file5out.txt", "./file6out.txt"};

        try {
            for (int i = 0; i < inFiles.length; i++) {
                Adder adder = new Adder(inFiles[i], outFiles[i]);
                adder.doAdd();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

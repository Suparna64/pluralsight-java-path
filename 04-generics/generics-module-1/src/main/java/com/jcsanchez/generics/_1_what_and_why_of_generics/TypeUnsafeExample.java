package com.jcsanchez.generics._1_what_and_why_of_generics;


/**
 * Created by jsssn on 30-Apr-17.
 */
public class TypeUnsafeExample {
    public static void main(String[] args) {
        CircularBuffer<String> buffer = new CircularBuffer<String>(10);

        buffer.offer("a");
        buffer.offer("bc");
        buffer.offer("d");

        String value = concatenate(buffer);
        System.out.println(value);
    }

    private static String concatenate(CircularBuffer<String> buffer) {
        StringBuilder result = new StringBuilder();

        String value;
        while ((value = buffer.poll()) != null) {
            result.append(value);
        }

        return result.toString();
    }
}

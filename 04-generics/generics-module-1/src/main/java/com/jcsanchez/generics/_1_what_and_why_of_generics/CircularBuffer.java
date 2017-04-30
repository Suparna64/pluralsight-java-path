package com.jcsanchez.generics._1_what_and_why_of_generics;

/**
 * Created by jsssn on 30-Apr-17.
 */
public class CircularBuffer {
    private Object[] buffer;
    private int readCursor = 0;
    private int writeCursor = 0;

    public CircularBuffer(int size) {
        buffer = new Object[size];
    }

    public boolean offer(Object value) {
        if (buffer[writeCursor] != null) {
            return false;
        }

        buffer[writeCursor] = value;
        writeCursor = next(writeCursor);

        return true;
    }

    public Object poll() {
        final Object value = buffer[readCursor];

        if (value != null) {
            buffer[readCursor] = null;
            readCursor = next(readCursor);
        }

        return value;
    }

    private int next(int index) {
        return (index + 1) % buffer.length;
    }
}

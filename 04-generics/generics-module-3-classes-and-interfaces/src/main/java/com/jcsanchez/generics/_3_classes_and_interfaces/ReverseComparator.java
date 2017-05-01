package com.jcsanchez.generics._3_classes_and_interfaces;

import sun.plugin.com.event.COMEventHandler;

import java.util.Comparator;

/**
 * Created by jsssn on 30-Apr-17.
 */
public class ReverseComparator<T> implements Comparator<T> {
    private final Comparator<T> delegateComparator;

    public ReverseComparator(final Comparator<T> delegateComparator) {
        this.delegateComparator = delegateComparator;
    }

    @Override
    public int compare(T left, T right) {
        return -1 * delegateComparator.compare(left, right);
    }
}

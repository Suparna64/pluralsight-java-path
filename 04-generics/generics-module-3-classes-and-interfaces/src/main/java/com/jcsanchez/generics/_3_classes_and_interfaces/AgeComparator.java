package com.jcsanchez.generics._3_classes_and_interfaces;

import java.util.Comparator;

/**
 * Created by jsssn on 30-Apr-17.
 */
public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person left, Person right) {
        return Integer.compare(left.getAge(), right.getAge());
    }
}

package com.jcsanchez.generics._5_wildcards;

/**
 * Created by jsssn on 01-May-17.
 */
public class Partner extends Person {
    public Partner(final String name, final int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Partner{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}

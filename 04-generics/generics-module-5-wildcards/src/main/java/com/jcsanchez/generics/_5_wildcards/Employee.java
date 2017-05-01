package com.jcsanchez.generics._5_wildcards;

/**
 * Created by jsssn on 01-May-17.
 */
public class Employee extends Person {
    public Employee(final String name, final int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}

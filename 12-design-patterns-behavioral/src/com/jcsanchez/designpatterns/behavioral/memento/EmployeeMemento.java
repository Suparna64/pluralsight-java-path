package com.jcsanchez.designpatterns.behavioral.memento;

/**
 * Created by jsssn on 20-May-17.
 */

// Memento
public class EmployeeMemento {

    private String name;
    private String phone;

    public EmployeeMemento(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}

package com.jcsanchez.designpatterns.behavioral.memento;

import java.util.Stack;

/**
 * Created by jsssn on 20-May-17.
 */

// Caretaker
public class Caretaker {

    private Stack<EmployeeMemento> employeeHistory = new Stack<>();

    public void save(Employee emp) {
        employeeHistory.push(emp.save());
    }

    public void revert(Employee employee) {
        employee.revert(employeeHistory.pop());
    }
}

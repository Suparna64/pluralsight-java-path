package com.jcsanchez.designpatterns.structural.adapter;

import java.util.List;

/**
 * Created by jsssn on 18-May-17.
 */
public class AdapterDemo {

    public static void main(String[] args) {
        EmployeeClient client = new EmployeeClient();

        List<Employee> employees = client.getEmployeeList();

        System.out.println(employees);
    }
}

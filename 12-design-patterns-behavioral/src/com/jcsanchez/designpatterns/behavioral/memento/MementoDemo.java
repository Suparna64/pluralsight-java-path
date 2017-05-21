package com.jcsanchez.designpatterns.behavioral.memento;

/**
 * Created by jsssn on 20-May-17.
 */
public class MementoDemo {

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        Employee employee = new Employee();

        employee.setName("John Wick");
        employee.setAddress("111 Main st");
        employee.setPhone("555-555-5555");

        System.out.println("Employee before save: \t\t\t\t\t\t" + employee);

        caretaker.save(employee);

        employee.setPhone("222-222-2222");
        caretaker.save(employee);

        System.out.println("Employee after changed phone number save:\t" + employee);

        employee.setPhone("111-111-1111");

        caretaker.revert(employee);
        System.out.println("Revert to last save point:\t\t\t\t\t" + employee);

        caretaker.revert(employee);
        System.out.println("Reverted to original: \t\t\t\t\t\t" + employee);
    }
}

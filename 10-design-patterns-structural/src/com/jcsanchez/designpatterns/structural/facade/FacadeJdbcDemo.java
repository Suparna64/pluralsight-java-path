package com.jcsanchez.designpatterns.structural.facade;

import java.util.List;

/**
 * Created by jsssn on 19-May-17.
 */
public class FacadeJdbcDemo {

    public static void main(String[] args) {
        JdbcFaceade jdbcFaceade = new JdbcFaceade();

        jdbcFaceade.createTable();

        System.out.println("Table created.");

        jdbcFaceade.insertIntoTable();

        System.out.println("Record inserted.");

        List<Address> addresses = jdbcFaceade.getAddresses();

        for (Address address : addresses) {
            System.out.println(address.getId() + " " + address.getStreetName() + " " + address.getCity());
        }
    }
}

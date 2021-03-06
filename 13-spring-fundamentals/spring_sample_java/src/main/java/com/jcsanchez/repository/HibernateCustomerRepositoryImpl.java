package com.jcsanchez.repository;

import com.jcsanchez.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jsssn on 20-May-17.
 */

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Value("${dbUsername}")
    private String dbUsername;

    @Override
    public List<Customer> findAll() {
        System.out.println(dbUsername);

        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirstName("Bob");
        customer.setLastName("Smith");

        customers.add(customer);

        return customers;
    }
}

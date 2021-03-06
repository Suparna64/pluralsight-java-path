package com.jcsanchez.repository;

import com.jcsanchez.model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jsssn on 20-May-17.
 */
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirstName("Bob");
        customer.setLastName("Smith");

        customers.add(customer);

        return customers;
    }
}

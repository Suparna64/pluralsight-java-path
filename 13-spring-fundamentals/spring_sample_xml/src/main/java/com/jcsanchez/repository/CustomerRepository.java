package com.jcsanchez.repository;

import com.jcsanchez.model.Customer;

import java.util.List;

/**
 * Created by jsssn on 20-May-17.
 */
public interface CustomerRepository {
    List<Customer> findAll();
}

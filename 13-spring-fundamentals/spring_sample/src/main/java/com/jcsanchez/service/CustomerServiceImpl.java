package com.jcsanchez.service;

import com.jcsanchez.model.Customer;
import com.jcsanchez.repository.CustomerRepository;
import com.jcsanchez.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

/**
 * Created by jsssn on 20-May-17.
 */
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}

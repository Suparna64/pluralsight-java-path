package com.jcsanchez.service;

import com.jcsanchez.model.Customer;
import com.jcsanchez.repository.CustomerRepository;

import java.util.List;

/**
 * Created by jsssn on 20-May-17.
 */
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl() {

    }

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}

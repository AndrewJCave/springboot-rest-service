package com.andrewcave.springrest.services;

import com.andrewcave.springrest.domain.Customer;

import java.util.List;

public interface CustomerService {

    Customer findCustomerById(Long id);

    List<Customer> findAllCustomers();


}

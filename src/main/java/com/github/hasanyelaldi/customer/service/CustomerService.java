package com.github.hasanyelaldi.customer.service;

import com.github.hasanyelaldi.customer.models.Customer;
import com.github.hasanyelaldi.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Optional<Customer> getCustomer(long id) {
        Optional<Customer> customer = customerRepository.findById(id);
        return customer;
    }

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public List<Customer> getCustomersByStatus(boolean status) {
        return customerRepository.findAllByActive(status);
    }

    public Customer createCustomer(Customer customer) {
        customer.setCreatedTime(new Date());
        return customerRepository.save(customer);
    }

    public Customer editCustomer(long id, Customer customer) {
        customer.setId(id);
        customer.setUpdatedTime(new Date());
        return customerRepository.save(customer);
    }

    public void deleteCustomer(long id) {
        customerRepository.deleteById(id);
    }

}

package com.github.hasanyelaldi.customer.controller;

import com.github.hasanyelaldi.customer.models.Customer;
import com.github.hasanyelaldi.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customers/{id}")
    public Optional<Customer> getCustomer(@PathVariable("id") long id) {
        return customerService.getCustomer(id);
    }

    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @PostMapping("/customer")
    public Customer postCustomer(@RequestBody Customer newCustomer) {
        return customerService.createCustomer(newCustomer);
    }

    @PutMapping("/customer/{id}")
    public ResponseEntity<?> updateCustomer(@PathVariable("id") long id, @RequestBody Customer customer) {
        Optional<Customer> customerData = customerService.getCustomer(id);
        if (!customerData.isPresent())
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(customerService.editCustomer(id, customer));
    }

    @DeleteMapping("/deleteCustomer/{id}")
    public ResponseEntity<?> deleteCustomer(@PathVariable("id") long id) {
        Optional<Customer> customerData = customerService.getCustomer(id);
        if (!customerData.isPresent())
            return ResponseEntity.notFound().build();
        customerService.deleteCustomer(id);
        return ResponseEntity.ok(customerData.get().getName() + " deleted!");
    }


}
package com.github.hasanyelaldi.customer.repository;

import com.github.hasanyelaldi.customer.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findAllByActive(boolean active);
}
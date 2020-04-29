package com.github.hasanyelaldi.customer.repository;

import com.github.hasanyelaldi.customer.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
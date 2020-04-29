package com.github.hasanyelaldi.customer.repository;

import com.github.hasanyelaldi.customer.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}

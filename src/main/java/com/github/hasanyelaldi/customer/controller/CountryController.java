package com.github.hasanyelaldi.customer.controller;

import com.github.hasanyelaldi.customer.models.Country;
import com.github.hasanyelaldi.customer.models.Customer;
import com.github.hasanyelaldi.customer.repository.CountryRepository;
import com.github.hasanyelaldi.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CountryController {

    @Autowired
    CountryRepository countryRepository;

    @GetMapping("/countries")
    public ResponseEntity<?> getCountries() {
        return ResponseEntity.ok(countryRepository.findAll());
    }
}

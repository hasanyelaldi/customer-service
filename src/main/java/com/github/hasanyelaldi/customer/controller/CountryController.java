package com.github.hasanyelaldi.customer.controller;


import com.github.hasanyelaldi.customer.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5050")
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

package com.example.eventsourcing.controller;

import org.axonframework.queryhandling.QueryGateway;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
public class CustomerQueryController {
    
    //private final QueryGateway queryGateway;

    // @GetMapping
    // public List<Customer> listCustomers() {
    //     return repository.findAll();
    // }

    // @GetMapping("/{customerId}")
    // public Customer getCustomer(@PathVariable String customerId) {
    //     return repository.findById(customerId)
    //             .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "customer " + customerId));
    // }

}

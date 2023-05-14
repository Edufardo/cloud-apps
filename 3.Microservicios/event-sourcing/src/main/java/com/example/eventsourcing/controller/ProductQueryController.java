package com.example.eventsourcing.controller;

import org.axonframework.queryhandling.QueryGateway;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductQueryController {
    //private final QueryGateway queryGateway;

    // @GetMapping()
    // public List<Product> listProducts() {
    //     return repository.findAll();
    // }

    // @GetMapping("/{productId}")
    // public Product getProduct(@PathVariable String productId) {
    //     return repository.findById(productId)
    //             .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product with ID " + productId));
    // }
}

package com.example.eventsourcing.controller;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductCommandController {
    
    //private final CommandGateway commandGateway;

    // @PostMapping()
    // public String addProduct(@RequestBody Product product) {
    //     Assert.state(product.getPrice().doubleValue() > 0, "Price of a product can't be less or equal to 0");

    //     if (product.getProductId() == null) {
    //         product.setProductId(UUID.randomUUID().toString());
    //     }

    //     repository.save(product);

    //     return product.getProductId();
    // }
}


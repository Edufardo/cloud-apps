package com.example.eventsourcing.controller;

import java.util.UUID;
import java.util.concurrent.Future;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.web.bind.annotation.*;

import com.example.eventsourcing.coreapi.ProductRegistration;
import com.example.eventsourcing.coreapi.RegisterProductCommand;

@RestController
@RequestMapping("/api/product")
public class ProductCommandController {
    
    private final CommandGateway commandGateway;

    public ProductCommandController(CommandGateway commandGateway){
        this.commandGateway = commandGateway;
    }

    @PostMapping()
    public Future<Void> addProduct(@RequestBody ProductRegistration product) {
        return commandGateway.send(
            new RegisterProductCommand(
                    product.getProductId()!=null?product.getProductId() : UUID.randomUUID().toString(),
                    product.getName(),
                    product.getDescription(),
                    product.getPrice()
            ));
    }
}


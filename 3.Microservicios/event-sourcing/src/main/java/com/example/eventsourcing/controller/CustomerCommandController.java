package com.example.eventsourcing.controller;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
public class CustomerCommandController {

    //private final CommandGateway commandGateway;

    // @PostMapping()
    // public String createCustomer(@RequestBody Customer customer) {
    //     if (customer.getCustomerId() == null) {
    //         customer.setCustomerId(UUID.randomUUID().toString());
    //     }

    //     repository.save(customer);

    //     return customer.getCustomerId();
    // }

    // @PostMapping("/{customerId}/cart")
    // public String createCart(@PathVariable String customerId) {
    //     ShoppingCart shoppingCart = new ShoppingCart();
    //     shoppingCart.setCartId(UUID.randomUUID().toString());
    //     shoppingCart.setCustomerId(customerId);
    //     shoppingCartRepository.save(shoppingCart);

    //     return shoppingCart.getCartId();
    // }

    
}

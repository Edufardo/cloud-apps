package com.example.eventsourcing.controller;

import java.util.UUID;
import java.util.concurrent.Future;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.web.bind.annotation.*;

import com.example.eventsourcing.coreapi.CustomerRegistration;
import com.example.eventsourcing.coreapi.RegisterCustomerCommand;


@RestController
@RequestMapping("/api/customer")
public class CustomerCommandController {

    private final CommandGateway commandGateway;

    public CustomerCommandController(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    @PostMapping()
    public Future<Void> createCustomer(@RequestBody CustomerRegistration customer) {
        return commandGateway.send(
                new RegisterCustomerCommand(
                        customer.getCustomerId()!=null?customer.getCustomerId():UUID.randomUUID().toString(),
                        customer.getFullName(),
                        customer.getAddres()
                )
        );
    }

    // @PostMapping("/{customerId}/cart")
    // public String createCart(@PathVariable String customerId) {
    //     ShoppingCart shoppingCart = new ShoppingCart();
    //     shoppingCart.setCartId(UUID.randomUUID().toString());
    //     shoppingCart.setCustomerId(customerId);
    //     shoppingCartRepository.save(shoppingCart);

    //     return shoppingCart.getCartId();
    // }    
}

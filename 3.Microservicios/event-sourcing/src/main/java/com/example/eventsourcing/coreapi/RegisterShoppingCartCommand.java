package com.example.eventsourcing.coreapi;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class RegisterShoppingCartCommand {
    
    @TargetAggregateIdentifier
    String cartId;
    String customerId;

    public RegisterShoppingCartCommand(String cartId, String customerId) {
        this.cartId = cartId;
        this.customerId = customerId;
    }
    
    public String getCartId() {
        return cartId;
    }

    public String getCustomerId() {
        return customerId;
    }
}

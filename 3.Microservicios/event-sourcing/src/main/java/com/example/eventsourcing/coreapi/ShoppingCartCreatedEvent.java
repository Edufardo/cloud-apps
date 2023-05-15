package com.example.eventsourcing.coreapi;

public class ShoppingCartCreatedEvent {

    String cartId;
    String customerId;

    public ShoppingCartCreatedEvent(String cartId, String customerId) {
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

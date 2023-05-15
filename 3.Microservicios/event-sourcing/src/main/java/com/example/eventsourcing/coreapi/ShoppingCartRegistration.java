package com.example.eventsourcing.coreapi;

public class ShoppingCartRegistration {
    String cartId;
    String customerId;

    public ShoppingCartRegistration(){

    }

    public ShoppingCartRegistration(String cartId, String customerId) {
        this.cartId = cartId;
        this.customerId = customerId;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String customerId) {
        this.cartId = customerId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String fullName) {
        this.customerId = fullName;
    }
}

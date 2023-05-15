package com.example.eventsourcing.coreapi;

public class ShoppingCartQuery {
    String cartId;

    public ShoppingCartQuery() { 
    }

    public ShoppingCartQuery(String cartId) {
        this.cartId = cartId;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String customerId) {
        this.cartId = customerId;
    }
}

package com.example.eventsourcing.coreapi;

public class ProductQuery {

    String productId;

    public ProductQuery() {
        
    }
    
    public ProductQuery(String productId) {
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String customerId) {
        this.productId = customerId;
    }
}

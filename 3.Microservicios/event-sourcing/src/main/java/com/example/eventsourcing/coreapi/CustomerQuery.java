package com.example.eventsourcing.coreapi;

public class CustomerQuery {
    String customerId;

    public CustomerQuery() {
        
    }
    
    public CustomerQuery(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}

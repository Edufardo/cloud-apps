package com.example.eventsourcing.coreapi;

public class CustomerCreatedEvent {
    
    String customerId;
    String fullName;
    String addres;

    public CustomerCreatedEvent(String customerId, String fullName, String addres) {
        this.customerId = customerId;
        this.fullName = fullName;
        this.addres = addres;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAddres() {
        return addres;
    }
}

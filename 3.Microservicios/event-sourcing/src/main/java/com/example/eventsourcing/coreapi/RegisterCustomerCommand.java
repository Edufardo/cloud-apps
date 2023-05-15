package com.example.eventsourcing.coreapi;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class RegisterCustomerCommand {

    @TargetAggregateIdentifier
    String customerId;
    String fullName;
    String addres;

    public RegisterCustomerCommand(String customerId, String fullName, String addres) {
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

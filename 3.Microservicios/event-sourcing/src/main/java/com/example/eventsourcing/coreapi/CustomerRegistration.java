package com.example.eventsourcing.coreapi;

public class CustomerRegistration {
    String customerId;
    String fullName;
    String addres;

    public CustomerRegistration(){

    }

    public CustomerRegistration(String customerId, String fullName, String addres) {
        this.customerId = customerId;
        this.fullName = fullName;
        this.addres = addres;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }
}

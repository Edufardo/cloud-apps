package com.example.eventsourcing.coreapi;

import java.math.BigDecimal;

public class ProductRegistration {

    String productId;
    String name;
    String description;
    BigDecimal price;

    public ProductRegistration(){

    }

    public ProductRegistration(String productId, String name, String description, BigDecimal price) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String customerId) {
        this.productId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String fullName) {
        this.name = fullName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String addres) {
        this.description = addres;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}

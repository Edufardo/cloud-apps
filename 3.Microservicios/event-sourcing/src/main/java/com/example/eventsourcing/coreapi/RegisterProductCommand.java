package com.example.eventsourcing.coreapi;

import java.math.BigDecimal;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class RegisterProductCommand {

    @TargetAggregateIdentifier
    String productId;
    String name;
    String description;
    BigDecimal price;

    public RegisterProductCommand(String productId, String name, String description, BigDecimal price) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
    }
    
    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }
}

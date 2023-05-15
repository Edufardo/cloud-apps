package com.example.eventsourcing.command;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

import com.example.eventsourcing.coreapi.ProductCreatedEvent;
import com.example.eventsourcing.coreapi.RegisterProductCommand;

@Aggregate
public class Product {
    
    @AggregateIdentifier
    private String productId;

    public Product(){ 
    }

    @CommandHandler
    public Product(RegisterProductCommand command) {
        AggregateLifecycle.apply(new ProductCreatedEvent(command.getProductId(), command.getName(), command.getDescription(), command.getPrice()));
    }

    @EventSourcingHandler
    public void on(ProductCreatedEvent event) {
        this.productId = event.getProductId();
    }
}

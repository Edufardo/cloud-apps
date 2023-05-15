package com.example.eventsourcing.command;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

import com.example.eventsourcing.coreapi.CustomerCreatedEvent;
import com.example.eventsourcing.coreapi.RegisterCustomerCommand;

@Aggregate
public class Customer {

    @AggregateIdentifier
    private String customerId;

    public Customer(){ 
    }

    @CommandHandler
    public Customer(RegisterCustomerCommand command) {
        AggregateLifecycle.apply(new CustomerCreatedEvent(command.getCustomerId(), command.getFullName(), command.getAddres()));
    }

    @EventSourcingHandler
    public void on(CustomerCreatedEvent event) {
        this.customerId = event.getCustomerId();
    }
}

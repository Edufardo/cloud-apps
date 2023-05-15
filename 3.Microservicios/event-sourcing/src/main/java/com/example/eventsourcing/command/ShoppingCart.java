package com.example.eventsourcing.command;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

import com.example.eventsourcing.coreapi.RegisterShoppingCartCommand;
import com.example.eventsourcing.coreapi.ShoppingCartCreatedEvent;

@Aggregate
public class ShoppingCart {
    
    @AggregateIdentifier
    private String cartId;

    public ShoppingCart(){ 
    }
    
    @CommandHandler
    public ShoppingCart(RegisterShoppingCartCommand command) {
        AggregateLifecycle.apply(new ShoppingCartCreatedEvent(command.getCartId(), command.getCustomerId()));
    }

    @EventSourcingHandler
    public void on(ShoppingCartCreatedEvent event) {
        this.cartId = event.getCartId();
    }
}

package com.example.eventsourcing.query.shoppingCart;

import org.axonframework.eventhandling.EventHandler;
import org.axonframework.queryhandling.QueryHandler;

import com.example.eventsourcing.coreapi.ShoppingCartCreatedEvent;
import com.example.eventsourcing.coreapi.ShoppingCartQuery;

public class ShoppingCartInfoProjection {

    private final ShoppingCartInfoRepository shoppingCartRepository;

    public ShoppingCartInfoProjection(ShoppingCartInfoRepository shoppingCartRepository){
        this.shoppingCartRepository = shoppingCartRepository;
    }

    @EventHandler
    public void on(ShoppingCartCreatedEvent event){
        ShoppingCartInfo shoppingCartInfo = new ShoppingCartInfo();
        shoppingCartInfo.setCartId(event.getCartId());
        shoppingCartInfo.setCustomerId(event.getCustomerId());
        System.out.println("Shopping cart created: " + shoppingCartInfo);
        shoppingCartRepository.save(shoppingCartInfo);
    }

    @QueryHandler
    public ShoppingCartInfo handle(ShoppingCartQuery query) {
        return shoppingCartRepository.getReferenceById(query.getCartId());
    }
}

package com.example.eventsourcing.controller;

import java.util.concurrent.CompletableFuture;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.web.bind.annotation.*;

import com.example.eventsourcing.coreapi.ShoppingCartQuery;
import com.example.eventsourcing.query.shoppingCart.ShoppingCartInfo;

@RestController
@RequestMapping("/api/carts")
public class ShoppingCartQueryController {
    
    private final QueryGateway queryGateway;

    public ShoppingCartQueryController(QueryGateway queryGateway){
        this.queryGateway = queryGateway;
    }
    
    @GetMapping("/{cartId}")
    public CompletableFuture<ShoppingCartInfo> getShoppingCart(@PathVariable String cartId) {
        return queryGateway.query(new ShoppingCartQuery(cartId), ResponseTypes.instanceOf(ShoppingCartInfo.class));
    }

}

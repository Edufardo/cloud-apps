package com.example.eventsourcing.controller;

import org.axonframework.queryhandling.QueryGateway;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/carts")
public class ShoppingCartQueryController {
    // private final QueryGateway queryGateway;
    
    // @GetMapping
    // public List<ShoppingCart> listAllCarts(){
    //     return repository.findAll();
    // }

    // @GetMapping("/{cartId}")
    // public ShoppingCart getCart(@PathVariable String cartId) {
    //     return repository.findById(cartId)
    //             .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Shopping Cart " + cartId));
    // }

    // private Optional<CartItem> getCartItem(ShoppingCart shoppingCart, String productId) {
    //     Optional<CartItem> cartItem = shoppingCart.getItems()
    //             .stream()
    //             .filter(item -> item.getProductId().equalsIgnoreCase(productId))
    //             .findFirst();
    //     return cartItem;
    // }

}

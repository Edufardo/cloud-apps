package com.example.eventsourcing.controller;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/carts")
public class ShoppingCartCommandController {
    
    // private final CommandGateway commandGateway;

    // @PostMapping("/{cartId}/product/{productId}")
    // public String addItem(@PathVariable String cartId, @PathVariable String productId, @RequestParam int quantity) {
    //     ShoppingCart shoppingCart = getShoppingCart(cartId);
    //     Optional<CartItem> cartItem = getCartItem(shoppingCart, productId);

    //     cartItem.ifPresentOrElse(
    //                 item -> item.setQuantity(item.getQuantity() + quantity),
    //                 () -> shoppingCart.addItem(new CartItem(productId, quantity))
    //             );

    //     repository.save(shoppingCart);

    //     return shoppingCart.getCartId();
    // }


    // @DeleteMapping("/{cartId}/product/{productId}")
    // public String removeItem(@PathVariable String cartId, @PathVariable String productId, @RequestParam int quantity) {
    //     ShoppingCart shoppingCart = getShoppingCart(cartId);
    //     CartItem cartItem = getCartItem(shoppingCart, productId)
    //             .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product " + productId + " in cart " + cartId));

    //     if (quantity == 0 || quantity >= cartItem.getQuantity()) { //remove the product from cart
    //         shoppingCart.getItems().remove(cartItem);
    //     } else {
    //         cartItem.setQuantity(cartItem.getQuantity() - quantity);
    //     }
        
    //     repository.save(shoppingCart);

    //     return shoppingCart.getCartId();
    // }

    // private ShoppingCart getShoppingCart(String cartId) {
    //     ShoppingCart shoppingCart = repository.findById(cartId)
    //             .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cart " + cartId));
    //     return shoppingCart;
    // }

}

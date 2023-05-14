package com.example.eventsourcing.model.shoppingCart;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartInfoRepository extends JpaRepository<ShoppingCartInfo, String>{
    
}

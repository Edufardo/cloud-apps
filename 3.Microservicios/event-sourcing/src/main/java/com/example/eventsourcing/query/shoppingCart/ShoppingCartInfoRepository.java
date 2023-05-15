package com.example.eventsourcing.query.shoppingCart;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartInfoRepository extends JpaRepository<ShoppingCartInfo, String>{
    
}

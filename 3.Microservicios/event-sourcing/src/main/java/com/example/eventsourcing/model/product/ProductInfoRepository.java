package com.example.eventsourcing.model.product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

}

package com.example.eventsourcing.query.customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerInfoRepository extends JpaRepository<CustomerInfo, String>{
    
}

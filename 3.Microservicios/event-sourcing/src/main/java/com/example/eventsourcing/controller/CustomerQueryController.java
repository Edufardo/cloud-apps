package com.example.eventsourcing.controller;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.web.bind.annotation.*;

import com.example.eventsourcing.coreapi.AllCustomersQuery;
import com.example.eventsourcing.coreapi.CustomerQuery;
import com.example.eventsourcing.query.customer.CustomerInfo;

@RestController
@RequestMapping("/api/customer")
public class CustomerQueryController {
    
    private final QueryGateway queryGateway;

    public CustomerQueryController(QueryGateway queryGateway){
        this.queryGateway = queryGateway;
    }

    @GetMapping()
    public CompletableFuture<List<CustomerInfo>> listCustomers() {
        return queryGateway.query(new AllCustomersQuery(), ResponseTypes.multipleInstancesOf(CustomerInfo.class));
    }

    @GetMapping("/{customerId}")
    public CompletableFuture<CustomerInfo> getCustomer(@PathVariable String customerId) {
        return queryGateway.query(new CustomerQuery(customerId), ResponseTypes.instanceOf(CustomerInfo.class));
    }

}

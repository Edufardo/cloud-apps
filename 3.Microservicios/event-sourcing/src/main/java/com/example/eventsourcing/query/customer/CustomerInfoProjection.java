package com.example.eventsourcing.query.customer;

import java.util.List;

import org.axonframework.eventhandling.EventHandler;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Component;

import com.example.eventsourcing.coreapi.AllCustomersQuery;
import com.example.eventsourcing.coreapi.CustomerCreatedEvent;
import com.example.eventsourcing.coreapi.CustomerQuery;

@Component
public class CustomerInfoProjection {
    
    private final CustomerInfoRepository customerRepository;

    public CustomerInfoProjection(CustomerInfoRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @EventHandler
    public void on(CustomerCreatedEvent event){
        CustomerInfo customerInfo = new CustomerInfo();
        customerInfo.setCustomerId(event.getCustomerId());
        customerInfo.setFullName(event.getFullName());
        customerInfo.setAddress(event.getAddres());
        System.out.println("Customer created: " + customerInfo);
        customerRepository.save(customerInfo);
    }

    @QueryHandler
    public List<CustomerInfo> handleQuery(AllCustomersQuery query) {
        System.out.println("AllBikesQuert");
        return customerRepository.findAll();
    }

    @QueryHandler
    public CustomerInfo handle(CustomerQuery query) {
        return customerRepository.getReferenceById(query.getCustomerId());
    }
}

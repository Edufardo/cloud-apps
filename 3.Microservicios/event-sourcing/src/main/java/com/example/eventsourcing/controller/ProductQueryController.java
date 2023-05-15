package com.example.eventsourcing.controller;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.web.bind.annotation.*;

import com.example.eventsourcing.coreapi.AllProductsQuery;
import com.example.eventsourcing.coreapi.ProductQuery;
import com.example.eventsourcing.query.product.ProductInfo;

@RestController
@RequestMapping("/api/product")
public class ProductQueryController {

    private final QueryGateway queryGateway;

    public ProductQueryController(QueryGateway queryGateway){
        this.queryGateway = queryGateway;
    }

    @GetMapping()
    public CompletableFuture<List<ProductInfo>> listProducts() {
        return queryGateway.query(new AllProductsQuery(), ResponseTypes.multipleInstancesOf(ProductInfo.class));
    }

    @GetMapping("/{productId}")
    public CompletableFuture<ProductInfo> getCustomerProduct(@PathVariable String productId) {
        return queryGateway.query(new ProductQuery(productId), ResponseTypes.instanceOf(ProductInfo.class));
    }
}

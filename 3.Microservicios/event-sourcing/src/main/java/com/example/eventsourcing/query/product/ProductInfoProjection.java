package com.example.eventsourcing.query.product;

import java.util.List;

import org.axonframework.eventhandling.EventHandler;
import org.axonframework.queryhandling.QueryHandler;

import com.example.eventsourcing.coreapi.AllCustomersQuery;
import com.example.eventsourcing.coreapi.ProductCreatedEvent;
import com.example.eventsourcing.coreapi.ProductQuery;

public class ProductInfoProjection {

    private final ProductInfoRepository productRepository;

    public ProductInfoProjection(ProductInfoRepository productRepository){
        this.productRepository = productRepository;
    }

    @EventHandler
    public void on(ProductCreatedEvent event){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId(event.getProductId());
        productInfo.setName(event.getName());
        productInfo.setDescription(event.getDescription());
        productInfo.setPrice(event.getPrice());
        System.out.println("Product created: " + productInfo);
        productRepository.save(productInfo);
    }

    @QueryHandler
    public List<ProductInfo> handleQuery(AllCustomersQuery query) {
        System.out.println("AllProductsQuery");
        return productRepository.findAll();
    }

    @QueryHandler
    public ProductInfo handle(ProductQuery query) {
        return productRepository.getReferenceById(query.getProductId());
    }
}

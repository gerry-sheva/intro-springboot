package com.freshgoodies.freshgoodies.repository;

import com.freshgoodies.freshgoodies.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
    Product product;

    public ProductRepository() {
        this.product = new Product();
    }

    public Product getProduct() {
        return  this.product;
    }
}

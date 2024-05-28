package com.freshgoodies.freshgoodies.service;

import com.freshgoodies.freshgoodies.model.Product;
import com.freshgoodies.freshgoodies.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getProduct() {
        return productRepository.getProduct();
    }
}

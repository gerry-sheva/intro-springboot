package com.freshgoodies.freshgoodies.model;

public class Product {
    int id;
    String productName;

    public Product() {
        this.id = 420;
        this.productName = "balls";
    }

    public String printProducts() {
        return "This should be a list of products";
    }
}

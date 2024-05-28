package com.freshgoodies.freshgoodies.model;

public class Cart {
    int id;
    String cartName;

    public Cart() {
        this.id = 69;
        this.cartName = "balls";
    }

    public String printCart() {
        return "The cart is empty!";
    }
}

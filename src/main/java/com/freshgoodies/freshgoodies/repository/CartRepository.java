package com.freshgoodies.freshgoodies.repository;

import com.freshgoodies.freshgoodies.model.Cart;
import org.springframework.stereotype.Repository;

@Repository
public class CartRepository {

    Cart cart;

    public CartRepository() {
        this.cart = new Cart();
    }

    public Cart getCart() {
        return this.cart;
    }
}

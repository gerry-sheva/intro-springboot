package com.freshgoodies.freshgoodies.service;

import com.freshgoodies.freshgoodies.model.Cart;
import com.freshgoodies.freshgoodies.repository.CartRepository;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public Cart getCart() {
        return cartRepository.getCart();
    }
}

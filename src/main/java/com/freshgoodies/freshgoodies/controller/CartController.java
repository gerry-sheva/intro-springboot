package com.freshgoodies.freshgoodies.controller;

import com.freshgoodies.freshgoodies.service.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/cart")
public class CartController {

    CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping
    public String getCart() {
        return cartService.getCart().printCart();
    }
}

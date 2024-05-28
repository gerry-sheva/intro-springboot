package com.freshgoodies.freshgoodies.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping
    public String ping() {
        return "pling pling plong";
    }
}

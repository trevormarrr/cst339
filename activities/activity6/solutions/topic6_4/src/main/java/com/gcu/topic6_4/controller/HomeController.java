package com.gcu.topic6_4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	// public open mapping link
    @GetMapping("/")
    public String home() {
        return "Unsecure";
    }

    // secure mapping link
    @GetMapping("/secure")
    public String secure() {
        return "Secure";
    }
}

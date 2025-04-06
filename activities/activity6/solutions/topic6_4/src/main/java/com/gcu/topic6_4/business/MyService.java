package com.gcu.topic6_4.business;

import java.security.Principal;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/service")
public class MyService {
    @GetMapping("/test")
    public String test(Principal principal) {
        return "Hello " + principal.getName() + " and welcome to my protected service!";
    }
}
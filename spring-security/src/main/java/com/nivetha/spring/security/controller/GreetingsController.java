package com.nivetha.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello to Spring Security !!!";
    }

    @GetMapping("/bye")
    public String bye(){
        return "Bye Bye !!!";
    }
}

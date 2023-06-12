package com.marcos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloControllery {
    
    @GetMapping
    public String hello(){
        return "Hello, wolrd!";
    }
}

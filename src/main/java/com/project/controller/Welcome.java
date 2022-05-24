package com.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/welcome")
public class Welcome {

    @GetMapping("/hello")
    public String inquiryClaimFromAcs() {
        return "Hello, I am here. Welcome to my house";
    }
}
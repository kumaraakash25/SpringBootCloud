package com.tech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/getMessage")
public class TestController {

    @GetMapping
    public String getMessage() {
        System.out.println("##########  Request received  ##########");
        return "Welcome to K8";
    }
}

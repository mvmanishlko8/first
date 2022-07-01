package com.lko.first.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    String hello() {
        return "Hello World, Spring Boot in Lucknow!";
    }

}

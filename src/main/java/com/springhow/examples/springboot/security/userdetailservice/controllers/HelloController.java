package com.springhow.examples.springboot.security.userdetailservice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Principal principal) {
        return "Hello " + principal.getName() + " !";
    }
}

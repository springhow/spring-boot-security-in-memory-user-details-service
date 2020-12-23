package com.springhow.examples.springboot.security.userdetailservice.controllers;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final InMemoryUserDetailsManager inMemoryUserDetailsManager;

    public UserController(InMemoryUserDetailsManager inMemoryUserDetailsManager) {
        this.inMemoryUserDetailsManager = inMemoryUserDetailsManager;
    }

    @PostMapping("/register")
    public String register(@RequestParam("username") String username, @RequestParam("password") String password) {
        inMemoryUserDetailsManager.createUser(User.withUsername(username).password("{noop}" + password).roles("USER").build());
        return "New user created for username: " + username + " !";
    }
}

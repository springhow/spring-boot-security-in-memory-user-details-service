package com.springhow.examples.springboot.security.userdetailservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@SpringBootApplication
public class SpringBootSecurityUserDetailServiceExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSecurityUserDetailServiceExampleApplication.class, args);
    }

    @Bean
    public InMemoryUserDetailsManager getInMemoryUserDetailsManager() {
        return new InMemoryUserDetailsManager();
    }

}

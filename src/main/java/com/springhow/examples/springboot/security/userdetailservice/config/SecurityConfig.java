package com.springhow.examples.springboot.security.userdetailservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication().passwordEncoder(NoOpPasswordEncoder.getInstance())
//                .withUser("admin").password("admin1pass").roles("USER", "ADMIN").and()
//                .withUser("user1").password("user1pass").roles("USER").and()
//                .withUser("user2").password("user2pass").roles("USER").and()
//                .withUser("user3").password("user3pass").roles("USER");
//    }


    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring()
                .antMatchers(HttpMethod.POST, "/register")
                .antMatchers(HttpMethod.GET, "/register.html");
    }
}

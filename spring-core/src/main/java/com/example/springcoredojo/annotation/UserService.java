package com.example.springcoredojo.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Bean
    public String getName() {
        return "un nombre cualquiera";
    }

}

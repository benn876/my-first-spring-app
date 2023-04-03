package org.fasttrackit.myfirstspringapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MyConfiguration {

    @Bean
    public Engine myEngine() {
        return new Engine(200);
    }
}

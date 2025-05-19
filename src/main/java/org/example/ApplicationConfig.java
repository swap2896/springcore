package org.example;

import org.example.springcore.Airtel;
import org.example.springcore.Sim;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "org.example")
@Configuration
public class ApplicationConfig {

    @Bean
    public Sim Sim(){
        return new Airtel();
    }
}

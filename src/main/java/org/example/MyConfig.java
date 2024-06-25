package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:list")
public class MyConfig {
    @Bean
    public Pet catBean(){
        return new Cat();
    }

    @Bean
    public Pet dogBean() {
        return new Dog();
    }

    @Bean
    public Pet parrot1Bean() {
        return new Parrot1();
    }

    @Bean
    public Pet parrot2Bean() {
        return new Parrot2();
    }

    @Bean
    public Human humanBean() {
        return new Human(catBean(), dogBean(), parrot1Bean(), parrot2Bean());
    }
}
package org.example.config;

import org.example.Animal;
import org.example.BeanAnimal;
import org.example.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Animal animal(){
        return  new Dog();
    }
    @Bean(name = "beanAnimal")
    public BeanAnimal beanAnimal(){
        return new BeanAnimal(animal());
    }
}

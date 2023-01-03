package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        BeanAnimal beanAnimal=new BeanAnimal(new Cat());
        beanAnimal.shout();
        BeanAnimal beanAnimal1=new BeanAnimal(new Dog());
        beanAnimal1.shout();

    }
}
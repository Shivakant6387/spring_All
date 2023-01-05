package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCon
{
    public static void main(String[] args) {
//        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
//        BeanAnimal beanAnimal= (BeanAnimal) context.getBean("mybean");
//        beanAnimal.shout();
//        ApplicationContext context2=new ClassPathXmlApplicationContext("Dog.xml");
//        BeanAnimal beanAnimal2= (BeanAnimal) context2.getBean("mybeanD");
//        beanAnimal2.shout();
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        BeanAnimal beanAnimal= (BeanAnimal) context.getBean("beanAnimal");
        beanAnimal.shout();
    }
}

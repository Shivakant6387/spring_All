package org.example.singleton;

import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class AppMain {
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    @Bean
    public ServiceBean serviceBean(){
        return new ServiceBean();
    }

    @Bean
    public ClientBean1 clientBean1(){
        return new ClientBean1();
    }

    @Bean
    public ClientBean2 clientBean2(){
        return new ClientBean2();
    }

    public static void main(String[] args) {
        runApp();
        runApp();
    }

    private static void runApp() {
        System.out.println("--- running app ---");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppMain.class);
        context.getBean(ClientBean1.class).doSomething();
        context.getBean(ClientBean2.class).doSomething();
    }
}

package org.example.MessageService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value={"org.example.MessageService"})
public class DIConfiguration {
    @Bean
    public MessageService getMessageService(){
        return new EmailService();
    }
}

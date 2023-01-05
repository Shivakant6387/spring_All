package org.example.MessageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyApplication {
private MessageService service;
//	constructor-based dependency injection
	@Autowired
	public MyApplication(MessageService svc){
		this.service=svc;
	}

    @Autowired
    public void setService(MessageService svc){
        this.service=svc;
    }

    public boolean processMessage(String msg, String rec){
        //some magic like validation, logging etc
        return this.service.sendMessage(msg, rec);
    }
}

package org.example.Bank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountHolder {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bankconfig.xml");
        DetailBank detailBank= (DetailBank) context.getBean("myaccount");
        detailBank.shout();

    }
}

package org.example.Company;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompanyTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("companyconfig.xml");
        CompanyDatail companyDatail= (CompanyDatail) context.getBean("mycompany");
        companyDatail.shout();
    }
}

package org.example.com.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("collectionconfig.xml");
        Emp emp= (Emp) context.getBean("emp");
        System.out.println(emp.getName());
        System.out.println(emp);
        System.out.println(emp.getAddresses());
        System.out.println(emp.getPhones());
        System.out.println(emp.getCourses());
    }
}

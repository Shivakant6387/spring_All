package org.example.com.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTestMainClass
{
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("comstudentconfig.xml");
        Student student= (Student) context.getBean("student");
        System.out.println(student);
    }
}

package org.example.Student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentConfig {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("studentconfig.xml");
        Student student= (Student)context.getBean("stud");
        System.out.println(student);
    }
}

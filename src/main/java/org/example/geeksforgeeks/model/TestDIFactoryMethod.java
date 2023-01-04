package org.example.geeksforgeeks.model;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDIFactoryMethod {
    public static void main(String[] args) {
        AbstractApplicationContext context
                = new ClassPathXmlApplicationContext(
                "application-context.xml");

        // Spring check the blueprint for GeeksCourses bean
        // from application-context.xml file and return it
        GIITCourses giitCourses
                = (GIITCourses) context.getBean("courseId");

        // geeksCourses contain the dependency
        // of GeeksCourses class
        giitCourses.getCourseDetail();
    }
}

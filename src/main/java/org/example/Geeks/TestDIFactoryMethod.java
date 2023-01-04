package org.example.Geeks;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDIFactoryMethod {
    public static void main(String[] args) {
        // Reading the application-context file
        // from the class-path
        AbstractApplicationContext context
                = new ClassPathXmlApplicationContext(
                "geeksconfig.xml");

        // Spring check the blueprint for Geeks bean
        // from application-context.xml file and return it
        Geeks geeksObj = (Geeks)context.getBean("geeksId");

        // geeksObj contain the dependency of Geeks class
        geeksObj.geeksMessage();

    }
}

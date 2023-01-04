package org.example.Engine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IEngineTest {
    public static void main(String a[]) {
        ApplicationContext rootctx
                = new ClassPathXmlApplicationContext(
                "springContext.xml");

        // Instantiating the obj1 via Constructor DI
        Vehicle obj1
                = (Vehicle) rootctx
                .getBean("InjectwithConstructor");

        // Instantiating the obj1 via Setter DI
        Vehicle obj2
                = (Vehicle) rootctx
                .getBean("InjectwithSetter");

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj1 == obj2);
    }
}

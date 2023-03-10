package org.example.texteditor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EditorTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");

        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
        textEditor.spellCheck();
    }
}

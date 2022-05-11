package com.test7.annotations_autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp7 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans7.xml");

        TextEditor7 te = (TextEditor7) context.getBean("textEditor");

        te.spellCheck();
    }
}
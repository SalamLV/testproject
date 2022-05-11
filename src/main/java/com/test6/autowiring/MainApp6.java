package com.test6.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp6 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans6.xml");
        TextEditor6 te = (TextEditor6) context.getBean("textEditor");
        te.spellCheck();
        te.setName("Alex Nazenaov");
        System.out.println(te.getName() + " Printing te");

        TextEditor6 te2 = (TextEditor6) context.getBean("textEditor");
        System.out.println(te.getName() + " Printing te2");
    }
}
package com.test3.inheretance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp3 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans3.xml");

        HelloWorld3 objA = (HelloWorld3) context.getBean("helloWorld");
        objA.getMessage1();
        objA.getMessage2();

        HelloIndia3 objB = (HelloIndia3) context.getBean("helloIndia");
        objB.getMessage1();
        objB.getMessage2();
        objB.getMessage3();
    }
}

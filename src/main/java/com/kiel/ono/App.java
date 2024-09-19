package com.kiel.ono;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationOno.xml");

        Muclass muClass = (Muclass) context.getBean("muClass");
        System.out.println(muClass);

        AnoClass anoClass = (AnoClass) context.getBean("anoClass");
        System.out.println(anoClass);

    }
}

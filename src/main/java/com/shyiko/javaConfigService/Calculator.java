package com.shyiko.javaConfigService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public record Calculator(int a, int b) {

    public void run() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.shyiko.javaConfigService");

        if (a > b) {
            MinusService minusService = (MinusService) applicationContext.getBean("minusServiceJava");
            System.out.println(a + " - " + b + " = " + minusService.subtract(a, b));
        } else {
            PlusService plusService = (PlusService) applicationContext.getBean("plusServiceJava");
            System.out.println(a + " + " + b + " = " + plusService.add(a, b));
        }
    }
}

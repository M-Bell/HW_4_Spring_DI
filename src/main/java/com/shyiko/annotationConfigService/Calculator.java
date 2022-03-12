package com.shyiko.annotationConfigService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public record Calculator(int a, int b) {

    public void run() {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.shyiko.annotationConfigService");

        if (a > b) {
            System.out.println(a + " - " + b + " = " + applicationContext.getBean(MinusService.class).subtract(a, b));
        } else {
            System.out.println(a + " + " + b + " = " + applicationContext.getBean(PlusService.class).add(a, b));
        }
    }
}

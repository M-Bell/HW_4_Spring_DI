package HW_4.Annotation_Config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public record Calculator(int a, int b) {

    public void run() {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("HW_4.Annotation_Config");

        if (a > b) {
            System.out.println(a + " - " + b + " = " + applicationContext.getBean(MinusService.class).subtract(a, b));
        } else {
            System.out.println(a + " + " + b + " = " + applicationContext.getBean(PlusService.class).add(a, b));
        }
    }
}

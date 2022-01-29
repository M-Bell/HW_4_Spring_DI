package HW_4.XML_Config_Service;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public record Calculator(int a, int b) {

    public void run() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("bean-factory.xml");

        if (a > b) {
            MinusService minusService = (MinusService) beanFactory.getBean("minusService");
            System.out.println(a + " - " + b + " = " + minusService.subtract(a, b));
        } else {
            PlusService plusService = (PlusService) beanFactory.getBean("plusService");
            System.out.println(a + " + " + b + " = " + plusService.add(a, b));
        }
    }
}

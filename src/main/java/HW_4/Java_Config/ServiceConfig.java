package HW_4.Java_Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    PlusService plusServiceJava() {
        return new PlusService();
    }

    @Bean
    MinusService minusServiceJava() {
        return new MinusService();
    }
}

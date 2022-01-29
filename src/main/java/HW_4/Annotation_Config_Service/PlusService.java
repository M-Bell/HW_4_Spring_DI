package HW_4.Annotation_Config_Service;

import org.springframework.stereotype.Component;

@Component
public class PlusService {
    int add(int a, int b) {
        return a + b;
    }
}

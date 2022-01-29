package HW_4.Annotation_Config_Service;

import org.springframework.stereotype.Component;

@Component
public class MinusService {
    int subtract(int a, int b) {
        return a - b;
    }
}

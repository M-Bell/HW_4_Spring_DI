package com.shyiko.annotationConfigService;

import org.springframework.stereotype.Component;

@Component
public class MinusService {
    int subtract(int a, int b) {
        return a - b;
    }
}

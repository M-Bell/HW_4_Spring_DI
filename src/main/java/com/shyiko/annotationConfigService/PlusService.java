package com.shyiko.annotationConfigService;

import org.springframework.stereotype.Component;

@Component
public class PlusService {
    int add(int a, int b) {
        return a + b;
    }
}

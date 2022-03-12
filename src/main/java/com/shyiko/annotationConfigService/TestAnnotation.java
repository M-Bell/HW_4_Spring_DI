package com.shyiko.annotationConfigService;

public class TestAnnotation {

    public static void main(String[] args) {
        int a = 3;
        int b = 7;

        Calculator calculatorAnnotation = new Calculator(a, b);
        calculatorAnnotation.run();
    }
}

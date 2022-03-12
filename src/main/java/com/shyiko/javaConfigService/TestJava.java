package com.shyiko.javaConfigService;

public class TestJava {
    public static void main(String[] args) {
        int a = 9;
        int b = 7;

        Calculator calculatorJava = new Calculator(a, b);
        calculatorJava.run();
    }
}

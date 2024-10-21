package com.example.demo;

public interface InterfaceExam {

    private static int method1(){
        return 0;
    }
    private byte method(){
        return 0;
    }
    default String method3(){
        return "Hello";
    }
    String method4();
    int a=10;
}

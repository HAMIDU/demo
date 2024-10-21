package com.example.demo;

public abstract class  Abs extends OverloadingCalculation3{

    public Abs(){
        System.out.println("HELLO ABS");
    }
    abstract boolean cal();
    int calclulate(){
        return 1;
    }
    abstract boolean cal2();

}

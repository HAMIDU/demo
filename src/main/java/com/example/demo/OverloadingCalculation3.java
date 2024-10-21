package com.example.demo;

class OverloadingCalculation3{
    void sum(int a,long b){System.out.println("a method invoked");}
    void sum(long a,int b){System.out.println("b method invoked");}
    static final int f;
    static{
        f=100;
    }
    public static void main(String args[]){
        OverloadingCalculation3 obj=new OverloadingCalculation3();
        //obj.sum(20,20);//now ambiguity

        System.out.println(obj.f);

        OverloadingCalculation3 overloadingCalculation3 = new com.example.demo.OverloadingCalculation3();
        System.out.println(overloadingCalculation3 instanceof OverloadingCalculation3);
    }

}
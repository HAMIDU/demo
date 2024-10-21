package com.example.demo;


public class Main
{
    public static void main(String[] args)
    {
        int result = new Calculate()
        {
            @Override
            int multiply(int a, int b)
            {
                return a*b;
            }
        }.multiply(12,32);
        System.out.println("result = "+result);

        boolean abs=new Abs() {
            @Override
            boolean cal() {
                return false;
            }

            @Override
            boolean cal2() {
                return false;
            }
        }.cal();
        try {
            System.out.println("inside try");
        }finally {
            System.out.println("finally block");
        }

        Singleton first = Singleton.getInstance();
        System.out.println("First instance integer value:"+first.i);
        first.i=first.i+90;
        Singleton second = Singleton.getInstance();
        System.out.println("Second instance integer value:"+second.i);
        System.out.println( new Abs() {
           @Override
           boolean cal() {
               return false;
           }

           @Override
           boolean cal2() {
               return false;
           }
       }.cal());

    }
}
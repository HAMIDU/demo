package com.example.demo;

public class JavaCore {
    public static void main(String[] args) {
        int i=1;
        i=cal(i);
        System.out.println(i);

        System.out.println(10 + 20 + "Javatpoint");
        System.out.println("Javatpoint" + 10 + 20);

        System.out.println(10 * 20 + "Javatpoint");
        System.out.println("Javatpoint" + 10 * 20);
        for(int ii=0; ii>0; i++)
        {
            System.out.println("Hello Javatpoint");
        }
        String s="Sachin";
        s.concat(" Tendulkar");//concat() method appends the string at the end
        System.out.println(s);//will print Sachin because strings are immutable objects
    }
    static int cal (int p){
        p=p*10;
        return p;
    }
}

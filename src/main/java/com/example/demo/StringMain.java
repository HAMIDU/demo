package com.example.demo;

public class StringMain {

    public static void main(String[] args) {
        String s1= new String("Hamid");
        System.out.println(s1);
        String s2=new String("Hamid");
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);

        String s3="Hamid";
        String s4="Hamid";
        System.out.println(s3.equals(s4));
        System.out.println(s3==s4);
        Integer i1=10;
        Integer i2=10;
        System.out.println(i1.equals(i2));
        System.out.println(i1==i2);

        byte[] byteArray = { 'P', 'A', 'N', 'K', 'A', 'J' };
        byte[] byteArray1 = { 80, 65, 78, 75, 65, 74 };

        String str = new String(byteArray);
        String str1 = new String(byteArray1);

        System.out.println(str);
        System.out.println(str1);
    }
}

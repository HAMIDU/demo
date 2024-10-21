package com.example.demo;

public class GenericsType<T> {
    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
    public static <T extends Comparable<T>> int compare(T t1, T t2){
        return t1.compareTo(t2);
    }
    public static void main(String args[]){
        GenericsType<String> type = new GenericsType<>();
        type.setT("Pankaj"); //valid

        GenericsType type1 = new GenericsType(); //raw type
        type1.setT("Pankaj"); //valid
        type1.setT(10); //valid and autoboxing support
        System.out.println(type.getT());
        System.out.println(type1.getT());
    }
}

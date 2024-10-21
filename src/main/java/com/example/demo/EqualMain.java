package com.example.demo;

import java.util.Objects;

public class EqualMain {

    public static void main(String[] args) {
        Integer a1 = 100;
        Integer a2 = 100;
//        System.out.println(a1.equals(a2));
//        System.out.println(a1 == a2);
        int b1 = 10;
        int b2 = 10;
//        System.out.println(b1 == b2);
        Employer employer1= new Employer(35,"Hamid");
        Employer employer2= new Employer(35,"Hamid");
//        System.out.println(employer1.equals(employer2));
//        System.out.println(employer1 == employer2);
        Class<?> booleanClass = boolean.class;
        System.out.println(booleanClass.getCanonicalName());
Class<?> clazz= Employer.class;
        System.out.println(clazz.isEnum());

        Class<?> superClass = null;
        try {
            superClass = Class.forName("com.example.demo.DemoApplication").getSuperclass();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Reflection:");
        System.out.println(superClass); // prints "class com.journaldev.reflection.BaseClass"
        System.out.println(Object.class.getSuperclass()); // prints "null"
        System.out.println(String[][].class.getSuperclass());// prints "class java.lang.Object"
    }

    static class Employer {
       Integer age;
       String name;
        Employer(Integer age, String name){
            this.age = age;
            this.name=name;

        }
        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employer employer = (Employer) o;
            return Objects.equals(age, employer.age) && Objects.equals(name, employer.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(age, name);
        }
    }
}

package com.example.demo.interfaces;

public interface Second extends First {

    private boolean testfirst() {
        return false;
    }

    static boolean testsecond() {
        return false;
    }
}

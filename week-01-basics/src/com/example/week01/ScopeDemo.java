package com.example.week01;

public class ScopeDemo {
    static int classValue = 100;

    public static void main(String[] args) {
        int methodValue = 50;
        if (methodValue > 10) {
            int blockValue = 20;
            System.out.println(blockValue);
        }
        // blockValue is not accessible here.
    }
}

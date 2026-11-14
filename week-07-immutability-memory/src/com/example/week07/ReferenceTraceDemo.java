package com.example.week07;

public class ReferenceTraceDemo {
    public static void main(String[] args) {
        Student a = new Student();
        Student b = a;
        b.name = "Rahul";
        // TODO: predict, then print, a.name. Draw the stack and heap and explain why a.name also changes.
    }
}

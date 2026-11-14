package com.example.week10;

/**
 * The generic-method examples from the Week 10 plan (Blocks 3 and 4).
 */
public class GenericMethods {

    public static <T> void printArray(T[] values) {
        for (T value : values) {
            System.out.println(value);
        }
    }

    public static <T extends Number> double doubleValue(T number) {
        return number.doubleValue();
    }

    public static void main(String[] args) {
        // TODO (Block 2): create Box<String>, Box<Integer> and a Box of your own class
        // TODO (Block 3): call printArray with a String[] and an Integer[]
        // TODO (Block 4): call doubleValue with an Integer and a Double
    }
}

package com.example.week02;

/**
 * The example snippets from the Week 2 plan, collected in one runnable file.
 * Predict each value before you print it.
 */
public class DataTypeExamples {
    public static void main(String[] args) {
        // Block 1
        int age = 26;
        long worldPopulation = 8_000_000_000L;

        // Block 2
        float percentage = 87.5F;
        double accountBalance = 15234.75;
        System.out.println(0.1 + 0.2); // Explain why the result may not be exactly 0.3.

        // Block 3
        char grade = 'A';
        char newline = '\n';
        boolean passed = true;

        // Block 4 - widening
        int value = 100;
        long biggerValue = value;
        double decimalValue = biggerValue;
        // Block 4 - narrowing
        double price = 99.95;
        int roundedDown = (int) price;

        // Block 5
        byte first = 10;
        byte second = 20;
        int result = first + second;

        // TODO: print each variable above, predicting the output first.
    }
}

package com.example.week03;

/**
 * The example snippets from the Week 3 plan. Values marked "sample" were added
 * so the snippets compile; change them and predict the output.
 */
public class OperatorExamples {
    public static void main(String[] args) {
        // Block 1
        int a = 5;
        System.out.println(a++);
        System.out.println(++a);

        // Block 2
        int age = 20;              // sample value
        double percentage = 72.5;  // sample value
        boolean eligible = age >= 18 && percentage >= 60;
        System.out.println(eligible);

        // Block 4
        int marks = 55;            // sample value
        String result = marks >= 40 ? "Pass" : "Fail";
        System.out.println(result);
    }
}

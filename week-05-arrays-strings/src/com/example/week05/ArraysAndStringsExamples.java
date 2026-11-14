package com.example.week05;

/**
 * The example snippets from the Week 5 plan.
 */
public class ArraysAndStringsExamples {
    public static void main(String[] args) {
        // Block 1
        int[] marks = {75, 80, 92, 67, 88};
        System.out.println(marks.length);

        // Block 3
        String first = "Java";
        String second = "Java";
        System.out.println(first == second);
        System.out.println(first.equals(second));

        // Block 4 - draw the memory diagram for these three before printing anything
        String a = "Java";
        String b = "Java";
        String c = new String("Java");
        // TODO: predict, then print, a == b, a == c and a.equals(c)
    }
}

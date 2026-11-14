package com.example.week08;

public class DivisionDemo {
    public static void main(String[] args) {
        int number = 0; // sample value: try 0 and non-zero values

        try {
            int result = 10 / number;
        } catch (ArithmeticException exception) {
            System.out.println("Division by zero is not allowed.");
        }
    }
}

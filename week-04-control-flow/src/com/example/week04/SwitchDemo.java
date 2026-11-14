package com.example.week04;

public class SwitchDemo {
    public static void main(String[] args) {
        int day = 1; // sample value: change it and predict the output

        // Traditional switch
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            default:
                System.out.println("Invalid");
        }

        // Modern switch expression
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            default -> "Invalid";
        };
        System.out.println(dayName);
    }
}

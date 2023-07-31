package org.example;

public class MathUtilsExample {
    public static void main(String[] args) {
        // Calculate the absolute value of a number
        int num = -10;
        int absValue = Math.abs(num);
        System.out.println("Absolute value of " + num + " is: " + absValue);

        // Calculate the square root of a number
        double sqrtValue = Math.sqrt(25);
        System.out.println("Square root of 25 is: " + sqrtValue);

        // Calculate the power of a number
        double powerValue = Math.pow(2, 3);
        System.out.println("2 raised to the power of 3 is: " + powerValue);

        // Generate a random number between 0 (inclusive) and 1 (exclusive)
        double randomValue = Math.random();
        System.out.println("Random value between 0 and 1: " + randomValue);
    }
}

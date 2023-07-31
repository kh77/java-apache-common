package org.example;

import org.apache.commons.lang3.math.NumberUtils;

public class NumberUtilsExample {
    public static void main(String[] args) {
        // Check if a string is a valid number
        String str1 = "123";
        String str2 = "abc";
        boolean isNumber1 = NumberUtils.isCreatable(str1);
        boolean isNumber2 = NumberUtils.isCreatable(str2);
        System.out.println(str1 + " is a number: " + isNumber1);
        System.out.println(str2 + " is a number: " + isNumber2);

        // Convert a string to an integer or get the default value if invalid
        String numberStr = "42";
        int integerValue = NumberUtils.toInt(numberStr, 0); // Default value is 0
        System.out.println("Parsed integer value: " + integerValue);

        // Check if a number is within a specified range
        boolean isTenDigit = NumberUtils.isDigits("10");
        System.out.println("10 isDigits = " + isTenDigit);

        boolean isTenWordDigit = NumberUtils.isDigits("ten"); // null
        System.out.println("ten isTenWordDigit = " + isTenWordDigit);
    }
}

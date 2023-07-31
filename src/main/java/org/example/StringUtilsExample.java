package org.example;

import org.apache.commons.lang3.StringUtils;

public class StringUtilsExample {
    public static void main(String[] args) {
        String str = "  Hello, World!  ";

        // Remove leading and trailing whitespaces
        String trimmedStr = StringUtils.trim(str);
        System.out.println("Trimmed string: " + trimmedStr);

        // Check if a string is empty or null
        boolean isEmpty = StringUtils.isEmpty(str);
        System.out.println("Is the string empty or null? " + isEmpty);

        // Check if a string is blank (empty or contains only whitespaces)
        boolean isBlank = StringUtils.isBlank(str);
        System.out.println("Is the string blank? " + isBlank);

        // Replace a substring within a string
        String replacedStr = StringUtils.replace(str, "Hello", "Hi");
        System.out.println("Replaced string: " + replacedStr);

        // Convert a string to uppercase
        String upperCaseStr = StringUtils.upperCase(str);
        System.out.println("Uppercase string: " + upperCaseStr);
    }
}

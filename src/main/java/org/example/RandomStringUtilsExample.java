package org.example;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomStringUtilsExample {
    public static void main(String[] args) {
        // Generate a random alphanumeric string of length 10
        String randomAlphaNumeric = RandomStringUtils.randomAlphanumeric(10);
        System.out.println("Random Alphanumeric String: " + randomAlphaNumeric);

        // Generate a random string of specified length from a given character set
        String customRandomString = RandomStringUtils.random(8, "ABC123");
        System.out.println("Custom Random String: " + customRandomString);
    }
}

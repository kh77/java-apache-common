package org.example;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class ArrayUtilsExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Check if an array is empty or null
        boolean isEmpty = ArrayUtils.isEmpty(arr);
        System.out.println("Is the array empty or null? " + isEmpty);

        // Check if an array contains a specific element
        boolean containsElement = ArrayUtils.contains(arr, 3);
        System.out.println("Does the array contain the element 3? " + containsElement);

        // Create a new array by adding elements to the original array
        int[] newArray = ArrayUtils.add(arr, 6);
        System.out.println("New array with added element: " + Arrays.toString(newArray));
    }
}

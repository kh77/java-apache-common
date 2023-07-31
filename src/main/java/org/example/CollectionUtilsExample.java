package org.example;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class CollectionUtilsExample {
    public static void main(String[] args) {
        // Create two lists
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);

        // Union of two lists (combine unique elements from both lists)
        List<Integer> unionList = new ArrayList<>(CollectionUtils.union(list1, list2));
        System.out.println("Union of two lists: " + unionList);

        // Intersection of two lists (common elements in both lists)
        List<Integer> intersectionList = new ArrayList<>(CollectionUtils.intersection(list1, list2));
        System.out.println("Intersection of two lists: " + intersectionList);

        // Difference between two lists (elements in list1 but not in list2)
        List<Integer> differenceList = new ArrayList<>(CollectionUtils.subtract(list1, list2));
        System.out.println("Difference between two lists: " + differenceList);

        // Check if a collection is empty or null
        boolean isCollectionEmpty = CollectionUtils.isEmpty(list1);
        System.out.println("Is list1 empty or null? " + isCollectionEmpty);

        // Check if a collection contains any element from another collection
        boolean containsAny = CollectionUtils.containsAny(list1, list2);
        System.out.println("Does list1 contain any element from list2? " + containsAny);
    }
}

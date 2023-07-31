package org.example;

import org.apache.commons.lang3.ObjectUtils;

import java.lang.reflect.Field;

public class ObjectUtilsExample {
    public static void main(String[] args) throws IllegalAccessException {
        // Get the default value if the object is null
        String name = null;
        String defaultName = ObjectUtils.defaultIfNull(name, "Unknown");
        System.out.println("Name: " + defaultName);

        // Get the first non-null object from the provided arguments
        String nonNullStr = ObjectUtils.firstNonNull(null, "Hello", "World");
        System.out.println("First non-null string: " + nonNullStr);


        // Create a Student object with all fields set to null
        Student student1 = new Student();

        // Create another Student object with some fields set to non-null values
        Student student2 = new Student();
        student2.setName("John");
        student2.setAge(20);

        // Check if all fields of student1 are null
        boolean allFieldsNull1 = ObjectUtils.allNull(student1.getName(), student1.getAge(), student1.getAddress());
        System.out.println("Are all fields of student1 null? " + allFieldsNull1);

        // Check if all fields of student2 are null
        boolean allFieldsNull2 = ObjectUtils.allNull(student2.getName(), student2.getAge(), student2.getAddress());
        System.out.println("Are all fields of student2 null? " + allFieldsNull2);


        // Check if all fields of student are null through reflect
        boolean allFieldsNull3 = areAllFieldsNull(student1);
        System.out.println("Reflection: Are all fields of student1 null? " + allFieldsNull3);

    }

    private static <T> boolean areAllFieldsNull(T student) throws IllegalAccessException {
        Class<?> studentClass = student.getClass();
        Field[] fields = studentClass.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            Object value = field.get(student);
            if (value != null) {
                return false;
            }
        }
        return true;
    }
}

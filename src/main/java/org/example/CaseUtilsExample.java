package org.example;

import org.apache.commons.text.CaseUtils;

public class CaseUtilsExample {
    public static void main(String[] args) {
        String sentence = "this is an example sentence";

        // Convert the sentence to camel case
        String camelCaseString = CaseUtils.toCamelCase(sentence, false, ' ');
        System.out.println("Camel Case String: " + camelCaseString);

        sentence = "this is an example sentence";

        // Convert the sentence to snake case
        String snakeCaseString = toSnakeCase(sentence);
        System.out.println("Snake Case String: " + snakeCaseString);

        // Convert the sentence to kebab case (dash-separated)
        String kebabCaseString = toKebabCase(sentence);
        System.out.println("Kebab Case String: " + kebabCaseString);

        // Convert the sentence to title case (first letter capitalized)
        String titleCaseString = toTitleCase(sentence);
        System.out.println("Title Case String: " + titleCaseString);
    }

    private static String toSnakeCase(String input) {
        return input.replaceAll("\\s+", "_").toLowerCase();
    }

    private static String toKebabCase(String input) {
        return input.replaceAll("\\s+", "-").toLowerCase();
    }

    private static String toTitleCase(String input) {
        String[] words = input.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                if (result.length() > 0) {
                    result.append(" ");
                }
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase());
            }
        }

        return result.toString();
    }
}

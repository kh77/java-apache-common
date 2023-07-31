package org.example;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class IOUtilsExample {
    public static void main(String[] args) throws IOException {
        // Read the contents of a resource file on the classpath
        String resourceName = "example.txt";
        InputStream inputStream = IOUtilsExample.class.getClassLoader().getResourceAsStream(resourceName);

        if (inputStream != null) {
            // Read the contents of the InputStream into a String using UTF-8 encoding
            String fileContent = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
            System.out.println("File Content:\n" + fileContent);

            // Close the InputStream after reading
            inputStream.close();
        } else {
            System.err.println("Failed to read the resource: " + resourceName);
        }
    }
}

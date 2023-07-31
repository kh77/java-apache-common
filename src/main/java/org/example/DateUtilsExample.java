package org.example;

import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtilsExample {
    public static void main(String[] args) throws ParseException {
        // Parse a date string into a Date object
        String dateString = "2023-07-30";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dateFormat.parse(dateString);

        // Add days to a date
        Date newDate = DateUtils.addDays(date, 7);
        System.out.println("Original Date: " + dateFormat.format(date));
        System.out.println("New Date (after adding 7 days): " + dateFormat.format(newDate));

        // Truncate date to a specific field (e.g., day, month, year)
        Date truncatedDate = DateUtils.truncate(date, java.util.Calendar.MONTH);
        System.out.println("Truncated Date (to month): " + dateFormat.format(truncatedDate));
    }
}

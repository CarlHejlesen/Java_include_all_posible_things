package medium_functionalities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.Period;

// This class demonstrates various operations with dates and times in Java.
public class DateTimeExample {

    // TimeSlot class represents a period with a start and end LocalDateTime.
    private static class TimeSlot {
        private LocalDateTime start;
        private LocalDateTime end;

        // Constructor initializes the TimeSlot with a start and end time.
        public TimeSlot(LocalDateTime start, LocalDateTime end) {
            this.start = start;
            this.end = end;
        }

        // Method to check if this TimeSlot overlaps with another TimeSlot.
        public boolean overlapsWith(TimeSlot other) {
            return !start.isAfter(other.end) && !end.isBefore(other.start);
        }
    }

    public static void main(String[] args) {
        // Create dates using the current date or a specific date.
        LocalDate date1 = LocalDate.now(); // Today's date
        LocalDate date2 = LocalDate.of(2024, 1, 1); // Specific date: January 1, 2024

        // Create times using the current time or a specific time.
        LocalTime time1 = LocalTime.now(); // Current time
        LocalTime time2 = LocalTime.of(14, 30); // Specific time: 2:30 PM

        // Create date-time combinations using the current date-time or a specific date-time.
        LocalDateTime dateTime1 = LocalDateTime.now(); // Current date and time
        LocalDateTime dateTime2 = LocalDateTime.of(date2, time2); // Specific date and time

        // Demonstrate adding to and subtracting from dates and times.
        LocalDate tomorrow = date1.plusDays(1); // Tomorrow's date
        LocalDate lastWeek = date1.minusWeeks(1); // Date one week ago
        LocalTime timeInFuture = time1.plus(Duration.ofHours(2)); // Time two hours from now
        LocalDate nextMonth = date1.plus(Period.ofMonths(1)); // Date one month from now

        // Compare dates and times to check for before/after/equality.
        boolean isBefore = date1.isBefore(date2); // True if date1 is before date2
        boolean isEqual = date1.isEqual(date2); // True if date1 is equal to date2
        boolean isAfter = time1.isAfter(time2); // True if time1 is after time2

        // Create TimeSlot objects to represent periods of time.
        TimeSlot slot1 = new TimeSlot(
                LocalDateTime.of(2024, 1, 1, 9, 0),
                LocalDateTime.of(2024, 1, 1, 17, 0)
        );
        TimeSlot slot2 = new TimeSlot(
                LocalDateTime.of(2024, 1, 1, 15, 0),
                LocalDateTime.of(2024, 1, 1, 18, 0)
        );

        // Check if the two time slots overlap.
        boolean overlaps = slot1.overlapsWith(slot2); // Will be true if there is an overlap.

        // Output the results of the operations.
       // Assuming today is January 8, 2024 (for the purpose of explanation)
System.out.println("Tomorrow: " + tomorrow); 
// Output: Tomorrow: 2024-01-09 (The date one day after the current date)

System.out.println("Last week: " + lastWeek); 
// Output: Last week: 2024-01-01 (The date one week before the current date)

System.out.println("Time in future: " + timeInFuture); 
// Output: Time in future: [Current Time + 2 hours] (The time two hours from the current time)

System.out.println("Next month: " + nextMonth); 
// Output: Next month: 2024-02-08 (The date one month after the current date)

System.out.println("Date1 is before Date2: " + isBefore); 
// Output: Date1 is before Date2: true (Since January 8, 2024 is before January 1, 2024 is false)

System.out.println("Date1 is equal to Date2: " + isEqual); 
// Output: Date1 is equal to Date2: false (Since January 8, 2024 is not equal to January 1, 2024)

System.out.println("Time1 is after Time2: " + isAfter); 
// Output: Time1 is after Time2: false (Assuming the current time is before 14:30)

System.out.println("Slot1 and Slot2 overlap: " + overlaps); 
// Output: Slot1 and Slot2 overlap: true (Since Slot1's end time of 17:00 is after Slot2's start time of 15:00)
    }
}
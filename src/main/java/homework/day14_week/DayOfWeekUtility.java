package homework.day14_week;

import java.time.LocalDateTime;

public class DayOfWeekUtility {

    private static String getDayOfWeekNextYear(int plusYears) {

        LocalDateTime ldt = LocalDateTime.now().plusYears(plusYears);
        int year = ldt.getYear();
        int dayNumber = ldt.getDayOfWeek().getValue();
        String dayValue = getDayOfWeek(dayNumber);

        if (year % 4 == 0 && year % 100 != 0) {
            if (dayNumber == 6 || dayNumber == 7) {
                return String.format("%s is Weekend of Leap Year!", dayValue);
            } else {
                return String.format("%s is working day of Leap Year :(", dayValue);
            }

        } else {
            return dayValue;
        }
    }

    public static String getDayOfWeek(int dayNumber) {

        if (dayNumber >= 1 && dayNumber <= 7) {
            return switch (dayNumber) {
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                case 7 -> "Sunday";
                default -> "Invalid day number";
            };
        }

        return "Invalid day number. Please provide a number between 1 and 7.";
    }
}
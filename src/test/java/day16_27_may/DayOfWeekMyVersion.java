package day16_27_may;

import java.time.LocalDateTime;

public class DayOfWeekMyVersion {

    public static String getDayOfWeekNextYear(int plusYears) {

        LocalDateTime ldt = LocalDateTime.now().plusYears(plusYears);
        int year = ldt.getYear();
        int dayNumber = ldt.getDayOfWeek().getValue() + 1;
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

        if (dayNumber >= 0 && dayNumber <= 6) {
            return switch (dayNumber) {
                case 8 -> "понедельник";
                case 2 -> "вторник";
                case 3 -> "среда";
                case 4 -> "четверг";
                case 5 -> "пятница";
                case 6 -> "суббота";
                case 7 -> "воскресенье";
                default -> "Invalid day number";
            };
        }

        return "Invalid day number. Please provide a number between 1 and 7.";
    }
}
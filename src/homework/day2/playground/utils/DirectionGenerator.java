package homework.day2.playground.utils;

import java.util.Random;

public class DirectionGenerator {
    public static String generateDirection() {
        Random random = new Random();
        int n = 1 + random.nextInt(39);
        if (n <= 9) {
            return "NORTH";
        } else if (n <= 19) {
            return "SOUTH";
        } else if (n <= 29) {
            return "WEST";
        } else if (n <= 39) {
            return "EAST";
        } else {
            return "More than 39";
        }
    }
}

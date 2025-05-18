package homework.day2.playground.utils;

import java.util.Random;

public class CoordinatesGenerator {
    public static int generateCoordinate() {
        Random random = new Random();
        int n = 1 + random.nextInt(79);
        System.out.println(String.format("CoordinatesGenerator: I have generated point with value: %d", n));
        return n;
    }
}

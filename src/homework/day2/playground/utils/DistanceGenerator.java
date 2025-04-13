package homework.day2.playground.utils;

import java.util.Random;

public class DistanceGenerator {
    public static int generateDistance() {
        Random random = new Random();
        int n = random.nextInt(1, 100);
        System.out.println(String.format("DistanceGenerator: I have generated distance with value: %d", n));
        return n;
    }
}

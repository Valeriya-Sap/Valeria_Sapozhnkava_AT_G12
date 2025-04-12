package homework.day2.playground.utils;

import java.util.Random;

public class DistanceGenerator {
    public static int generateDistance(){
        Random random = new Random();
        int n = 1 + random.nextInt(99);
        System.out.println(String.format("DistanceGenerator: I have generated distance with value: %d", n));
        return n;
    }
}

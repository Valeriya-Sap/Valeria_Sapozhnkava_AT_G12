package homework.day2.playground.utils;

import homework.day2.playground.essence.craft.material.Pourable;

import java.util.Random;

public class VolumeGenerator {
    public static int generateVolume(Pourable pourable) {
        String myClass = String.valueOf(pourable.getClass().getSimpleName());
        int volume = 0;
        if (myClass.equals("Disel") || myClass.equals("Petrol")) {
            Random random = new Random();
            volume = random.nextInt(1, 50);
        }
        if (myClass.equals("Water")) {
            Random random = new Random();
            volume = random.nextInt(50, 100);
        }
        System.out.printf("VolumeGenerator: I have generated volume of '%s' with value: '%d'", pourable.getClass().getSimpleName(), volume);
        return volume;
    }
}

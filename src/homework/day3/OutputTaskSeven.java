package homework.day3;

import homework.day2.playground.essence.creatures.Maylily;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OutputTaskSeven {
    public static void main(String[] arg) {
        Maylily firstMay = new Maylily(1, "First");

        try (FileOutputStream fos = new FileOutputStream("t.tmp");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(new Maylily(1, "First"));
            //oos.write(firstMay.getMass());
            //oos.writeChars(firstMay.getName());

        } catch (IOException e) {
            System.out.println("There is some exception!");
        }

    }
}

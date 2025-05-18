package homework.day3;

import homework.day2.playground.essence.creatures.Maylily;

import java.io.*;

public class IOputTaskEight {
    public static void main(String[] arg) {
        Maylily firstMay = new Maylily(1, "First");
        Maylily secondMay = null;

        try (FileOutputStream fos = new FileOutputStream("t.tmp");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(firstMay);
        } catch (IOException e) {
            System.out.println("There is some exception1!");
        }

        try (FileInputStream fis = new FileInputStream("t.tmp");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            secondMay = (Maylily)ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("There is some exception2!");
        }

        try (FileOutputStream fas = new FileOutputStream("tTwo.tmp");
             ObjectOutputStream oas = new ObjectOutputStream(fas)) {
            oas.writeChars(secondMay.toString());
            System.out.println("There is no some exception!");
        } catch (IOException e) {
            System.out.println("There is some exception!");
        }

    }
}

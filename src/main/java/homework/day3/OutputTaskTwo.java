package homework.day3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class OutputTaskTwo {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        String incoming = scanner.nextLine();

        String message = String.format("Hello, I just got '%s' from you!", incoming);
        try (FileOutputStream fos = new FileOutputStream("t.tmp");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeChars(message);

        } catch (IOException e) {
            System.out.println("There is some exception!");
        }
    }
}


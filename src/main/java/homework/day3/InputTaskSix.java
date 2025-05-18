package homework.day3;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InputTaskSix {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        String incoming = scanner.nextLine();
        String message = "";
        try (BufferedWriter out = new BufferedWriter(new FileWriter("t.tmp"))) {
            out.write(incoming);
        } catch (IOException e) {
            System.out.println("There is some exception!");
        }

        try (BufferedReader in = new BufferedReader(new FileReader("t.tmp"))) {
            String line;
            while ((line = in.readLine()) != null) {
                message = message + line;
            }
        } catch (IOException e) {
            System.out.println("There is some exception!");
        }
        Integer number;
        number = message.length();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
        String timestamp = LocalDateTime.now().format(formatter);
        String name = timestamp + "_" + number + ".tmp";
        try (BufferedWriter out = new BufferedWriter(new FileWriter(name))) {
            out.write(number.toString());
        } catch (IOException e) {
            System.out.println("There is some exception!");
        }
    }
}

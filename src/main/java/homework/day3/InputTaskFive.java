package homework.day3;

import java.io.*;
import java.util.Scanner;

public class InputTaskFive {
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
        int number;
        number = message.length();
        System.out.println(number);
    }
}


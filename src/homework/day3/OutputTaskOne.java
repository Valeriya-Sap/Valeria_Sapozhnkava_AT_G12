package homework.day3;

import java.util.Scanner;

public class OutputTaskOne {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        String incoming = scanner.nextLine();

        System.out.printf("Hello, I just got '%s' from you!", incoming);

    }
}

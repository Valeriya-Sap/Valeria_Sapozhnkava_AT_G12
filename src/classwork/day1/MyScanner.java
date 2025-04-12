package classwork.day1;

import java.util.Scanner;

public class MyScanner {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
            if (incoming.equals("Please stop")) {
                return;
            }
            System.out.printf("Just got '%s' text!", incoming);
        }
    }
}




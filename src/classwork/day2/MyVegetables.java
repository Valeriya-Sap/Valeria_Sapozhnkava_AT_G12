package classwork.day2;

import java.util.ArrayList;
import java.util.List;

public class MyVegetables {
    public static void main(String[] args) {
        List<String> vegetables = new ArrayList<>();
        vegetables.add("Помидор");
        vegetables.add("Огурец");
        vegetables.add("Кабачок");
        vegetables.add("Батат");
        vegetables.add("Картоха");

        for (String veget : vegetables) {
            System.out.print(veget + " ");
        }
        System.out.println();
        int numnerA = 0;
        for (String veget : vegetables) {
            if (veget.contains("а")) {
                numnerA++;
            }
        }

        System.out.println(numnerA);

        for (int i = 0; i < vegetables.size(); i++) {
            System.out.print(vegetables.get(i) + " ");
        }
        System.out.println();

        vegetables.remove("Огурец");
        vegetables.remove(3);

        for (String veget : vegetables) {
            System.out.print(veget + " ");
        }
    }
}

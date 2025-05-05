package classwork.day2;

import java.util.ArrayList;
import java.util.List;

public class MyName {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Оля");
        names.add("Коля");
        names.add("Аня");
        names.add("Миша");
        names.add("Даша");

        for (String color : names) {
            System.out.print(color + " ");
        }
        System.out.println();

        names.set(2, "Оля");
        names.set(4, "Катя");

        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + " ");
        }
        System.out.println();

        names.remove("Оля");

        names.remove(3);

        for (String color : names) {
            System.out.print(color + " ");
        }
    }
}

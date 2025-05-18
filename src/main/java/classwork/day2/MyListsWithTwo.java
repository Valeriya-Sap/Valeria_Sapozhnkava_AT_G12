package classwork.day2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyListsWithTwo {
    public static void main(String[] args) {
        List<String> myList1 = new ArrayList<>();
        List<String> myList2 = new LinkedList<>();
        int numbers = 1_000_000;

        long time = System.currentTimeMillis();

        for (int i = 0; i < numbers; i++) {
            myList1.add("Bla-" + i);
        }

        System.out.println(System.currentTimeMillis() - time);

        time = System.currentTimeMillis();

        for (int i = 0; i < numbers; i++) {
            myList2.add("Fla-" + i);
        }

        System.out.println(System.currentTimeMillis() - time);

        time = System.currentTimeMillis();

        for (int i = 0; i < numbers; i++) {
            myList1.get(i);
        }

        System.out.println(System.currentTimeMillis() - time);

        time = System.currentTimeMillis();

        for (int i = 0; i < numbers; i++) {
            myList2.get(i);
        }

        System.out.println(System.currentTimeMillis() - time);
    }
}

package classwork.day2;

import java.util.ArrayList;
import java.util.List;

public class MyCollections {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        String message = "мама мыла раму мыла";
        String[] myArray = message.split(" ");
        for (int i = 0; i < myArray.length; i++) {
            myList.add(myArray[i]);
            System.out.println(myList.get(i) + " ");
        }

        for (String word : myList) {
            System.out.println(word);
        }

    }
}

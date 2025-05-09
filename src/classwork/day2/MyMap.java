package classwork.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) {
        Map<Integer, String> words = new HashMap<Integer, String>();

        List<String> myList = new ArrayList<>();
        String[] myArray = "мама мыла раму мыла".split(" ");
        for (int i = 0; i < myArray.length; i++) {
            myList.add(myArray[i]);
        }

        for (int i = 0; i < myList.size(); i++) {
            words.put(i, myList.get(i));
        }

        for (int keys : words.keySet()) {
            System.out.println(keys);
        }

        for (String word : words.values()) {
            System.out.println(word);
        }

        for (Map.Entry<Integer, String> elemnet : words.entrySet()) {
            System.out.println(elemnet);
        }

    }
}

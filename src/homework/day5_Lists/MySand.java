package homework.day5_Lists;

import homework.lists_classes.Sand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MySand {
    public static void main(String[] args) {
//Создать пустой список песка (класса Sand) sandbox (через new ArrayList)

        List<Sand> sandbox = new ArrayList<>();

//Заполнить 4 объектами песка с весом (2, 4, 2, 7) и именами (Речной, Речной, Карьерный, Речной) соответственно

        sandbox.add(new Sand(2, "Речной"));
        sandbox.add(new Sand(4, "Речной"));
        sandbox.add(new Sand(2, "Карьерный"));
        sandbox.add(new Sand(7, "Речной"));

//Проитерировать список через for-each и отпечатать вес в консоль через пробел

        for (Sand sand : sandbox) {
            System.out.print(sand.getWeight() + " ");
        }

        System.out.println();

//Проитерировать список через for-each и отпечатать имена в консоль через пробел

        for (Sand sand : sandbox) {
            System.out.print(sand.getName() + " ");
        }

        System.out.println();

//Создать пустую карту, где ключом является целое число, а значением объект песка

        Map<Integer, Sand> mapSand = new HashMap<>();

//Заполнить карту значениями из предыдущего списка, используя в качестве ключа любое уникальное число

        for (int i = 0; i < sandbox.size(); i++) {
            mapSand.put(i, sandbox.get(i));
        }

//Проитерировать карту и отпечатать ключи в консоль

        for ( Integer key: mapSand.keySet()) {
            System.out.println(key);
        }

//Проитерировать карту и отпечатать значения в консоль

        for ( Sand value: mapSand.values()) {
            System.out.println(value);
        }

//Проитерировать карту и отпечатать пары ключ-значение в консоль

        for ( Map.Entry<Integer, Sand> sand: mapSand.entrySet()) {
            System.out.println(sand);
        }
    }
}

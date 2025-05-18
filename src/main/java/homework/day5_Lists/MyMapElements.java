package homework.day5_Lists;

import homework.lists_classes.Chair;

import java.util.HashMap;
import java.util.Map;

public class MyMapElements {
    public static void main(String[] args) {
//        Создать пустую коллекцию ключ-значение elements, содержающую Integer в качестве ключей,
//        стринги в качестве значения (через new HashMap)

        Map<Integer, String> elements = new HashMap<>();

//        Добавить в список 7 элементов (Silicon, Sulfur, Argon, Calcium, Chromium, Iron, Zinc) с ключами,
//        равными порядку их добавления в коллекцию, начиная с 1-цы
        int i = 1;
        elements.put(i, "Silicon");
        elements.put(++i, "Sulfur");
        elements.put(++i, "Argon");
        elements.put(++i, "Calcium");
        elements.put(++i, "Chromium");
        elements.put(++i, "Iron");
        elements.put(++i, "Zinc");

//        Проитерировать коллекцию через for-each и отпечатать название элементов в консоль через пробел

        for (String value : elements.values()) {
            System.out.print(value + " ");
        }

//        Посчитать сколько названий элементов содержит букву "u" и вывести число в консоль

        int numberU = 0;
        for (String value : elements.values()) {
            if (value.contains("u")) {
                numberU++;
            }
        }

        System.out.println();
        System.out.println(numberU);

//        Проитерировать коллекцию и отпечатать пары ключ-значение в консоль с новой строки

        for (Map.Entry<Integer, String> element : elements.entrySet()) {
            System.out.println(element);
        }

//        Заменить значение 4-го элемента на Selenium

        elements.replace(4, "Selenium");

//        Удалить 2-й элемент коллекции

        elements.remove(2);

//        Проитерировать коллекцию и отпечатать пары ключ-значение в консоль с новой строки

        for (Map.Entry<Integer, String> element : elements.entrySet()) {
            System.out.println(element);
        }
    }
}

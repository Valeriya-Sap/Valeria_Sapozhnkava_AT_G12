package homework.day5_Lists;

import java.util.ArrayList;
import java.util.List;

public class MyElements {
    public static void main(String[] args) {

//    Создать пустой список стрингов elements (через new ArrayList)

        List<String> elements = new ArrayList<>();

//    Добавить в список 6 элементов (Text field, Radio, Check-box, Drop-down, Picker, Breadcrumb)

        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");

//    Проитерировать список через for-each и отпечатать слова в консоль через пробел

        for (String element : elements) {
            System.out.print(element + " ");
        }

//    Посчитать сколько названий элементов состоит более, чем из одного слова и вывести число в консоль
        int count2 = 0;
        for (String element : elements) {
           if (element.contains(" ")){
               count2++;
           }
        }

        System.out.println();
        System.out.println(count2);

//    Проитерировать список по индексу и отпечатать слова в консоль через пробел

        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i) + " ");
        }
        System.out.println();
//    На 4-ю позицию добавить Spinner

        elements.add(4, "Spinner");

//    Удалить 2-й элемент списка

        elements.remove(2);

//    Заменить 5-й элемент на Switch

        elements.set(5, "Switch");

//    Проитерировать список через for-each и отпечатать слова в консоль через пробел

        for (String element : elements) {
            System.out.print(element + " ");
        }
    }
}

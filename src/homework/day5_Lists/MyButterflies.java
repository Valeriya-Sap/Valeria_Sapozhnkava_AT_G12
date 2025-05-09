package homework.day5_Lists;

import java.util.ArrayList;
import java.util.List;

public class MyButterflies {
    public static void main(String[] args) {
        //Создать пустой список стрингов butterflies (через new ArrayList)
        //Добавить в список 4 бабочек (Common blue, Swallowtail, Aglais io, Common blue)

        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        //Проитерировать список через for-each и отпечатать слова в консоль в кавычках

        for (String butterfly : butterflies) {
            System.out.println("\"" + butterfly + "\"");
        }

        //Посчитать сколько бабочек содержат букву "о" и вывести число в консоль

        int numberO = 0;

        for (String butterfly : butterflies) {
            if (butterfly.contains("o")) {
                numberO++;
            }
        }
        System.out.println(numberO);

        //Проитерировать список по индексу и отпечатать слова в консоль через пробел

        for (int i = 0; i < butterflies.size(); i++) {
            System.out.print(butterflies.get(i) + " ");
        }

        //Проитерировать список через for-each и отпечатать слова в консоль через перенос строки

        System.out.println();
        for (String butterfly : butterflies) {
            System.out.println(butterfly);
        }

    }
}

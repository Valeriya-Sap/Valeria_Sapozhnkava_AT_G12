package homework.day5_Lists;

import java.util.ArrayList;
import java.util.List;

public class MyNoodles {
    public static void main(String[] args) {
//Создать пустой список стрингов noodles (через new ArrayList)

        List<String> noodles = new ArrayList<>();

//Добавить в список 4 вида макарон (стринги Hakka, Ramen, Hibachi, Schezwan)

        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");

//Проитерировать список через for-each и отпечатать слова в консоль через тире

        for (String nood : noodles) {
            System.out.print(nood + "-");
        }

//Заменить в каждом слове буквы "а" на букву "о"

        for (int i = 0; i < noodles.size(); i++) {
            if (noodles.get(i).contains("a")) {
                noodles.set(i, noodles.get(i).replace("a", "o"));
            }
        }

        System.out.println();

//Проитерировать список по индексу и отпечатать слова в консоль через пробел

        for (int i = 0; i < noodles.size(); i++) {
            System.out.print(noodles.get(i) + " ");
        }

    }
}

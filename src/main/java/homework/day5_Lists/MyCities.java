package homework.day5_Lists;

import java.util.ArrayList;
import java.util.List;

public class MyCities {
    public static void main(String[] args) {
//        Создать пустой список стрингов cities (через new ArrayList)
//        Добавить в список 3 города (Минск, Москва, Берлин)

        List<String> cities = new ArrayList<>();
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

//        Проитерировать список через for-each и отпечатать слова в консоль с новой строки
        for (String city : cities) {
            System.out.println(city);
        }
//        Посчитать сумму всех буков во всех словах и вывести число в консоль

        int numbersS = 0;
        for (String city : cities) {
            numbersS = numbersS + city.length();
        }

        System.out.println(numbersS);

//        Проитерировать список по индексу и отпечатать слова в консоль через пробел

        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }
    }
}

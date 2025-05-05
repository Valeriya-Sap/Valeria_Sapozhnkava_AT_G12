package homework.day5_Lists;

import java.util.ArrayList;
import java.util.List;

public class MyCountries {
    public static void main(String[] args) {
        //Создать пустой список стрингов countries (через new ArrayList)

        List<String> countries = new ArrayList<>();

        //Добавить в список 4 страны (Андора, Португалия, Англия, Замбия)

        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");

        //Проитерировать список через for-each и отпечатать слова в консоль через запятую с пробелом

        for (String country : countries) {
            System.out.print(country + ", ");
        }

        //Посчитать сколько стран, в названии которых меньше 7 букв и вывести число в консоль

        int numbersS = 0;
        for (String country : countries) {
            numbersS = numbersS + country.length();
        }
        System.out.println();
        System.out.println(numbersS);


        //Проитерировать список по индексу и отпечатать слова в консоль с новой строки

        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }
    }
}

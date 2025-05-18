package homework.day6_Stream_API;

import java.util.ArrayList;
import java.util.List;

public class CitiesRunner {
    public static void main(String[] args) {
//Создать пустой список стрингов cities (через new ArrayList)
//Добавить в список 3 города (Минск, Москва, Берлин)
        List<String> cities = new ArrayList<>();
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");
//Посчитать сумму всех буков во всех словах и вывести число в консоль
        System.out.println(cities.stream().mapToInt(string -> string.length()).sum());
    }
}

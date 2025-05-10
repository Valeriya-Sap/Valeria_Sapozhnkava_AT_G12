package homework.day5_Lists;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MyCars {
    public static void main(String[] args) {
        //Создать набор строк стрингов cars из 7 авто (Мерс, Ауди, Жигуль, Рено, Жигуль, Жигуль, Ауди) (через new ArrayList)

        List<String> cars = new ArrayList<>();
        cars.add("Мерс");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");

        //Проитерировать список через for-each и отпечатать слова в файл cars через с новой строки в кавычках


        try (BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("cars.tmp"),
                "UTF-8"))) {
            for (String car : cars) {
                out.write("\"" + car + "\"" + "\n");
            }
        } catch (IOException e) {
            System.out.println("There is some exception!");
        }

        //Найти и удалить из набора авто, в названии которых больше 4 букв

        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).length() > 4) {
                cars.remove(i);
                i--;
            }
        }

        //Проитерировать список через for-each и отпечатать слова в консоль через пробел

        for (String car : cars) {
            System.out.print(car + " ");
        }
    }
}

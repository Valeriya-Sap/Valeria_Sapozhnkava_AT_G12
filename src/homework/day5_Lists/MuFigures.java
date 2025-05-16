package homework.day5_Lists;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MuFigures {
    public static void main(String[] args) {
        //Создать список строк стрингов figures из 5 фигур (Овал, Прямоугольник, Круг, Квадрат, Эллипс) через (Arrays.asList())

            List<String> figures = Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");

        //Проитерировать список через for-each и отпечатать слова в файл figures через тире

        try (BufferedWriter out = new BufferedWriter(new FileWriter("figures.tmp"))) {
            for (String figure : figures) {
                out.write(figure + "-");
            }
        } catch (IOException e) {
            System.out.println("There is some exception!");
        }

        //Посчитать сколько фигур НЕ содержат букву "и" и вывести число в консоль

        int numbersWithoutN = 0;
        for (String figure : figures) {
            if (!figure.contains("и")) {
                numbersWithoutN++;
            }
        }

        System.out.println();
        System.out.println(numbersWithoutN);

        //Проитерировать список по индексу и отпечатать слова в консоль через пробел

        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " ");
        }

        System.out.println();

        //Вставить на 3 позицию Треугольник

        try {
            figures.add(3, "Треугольник");
        } catch (Exception e) {
            System.out.println("The list was created as Array.asList. Arrays.asList(...) returns a fixed-size list backed by an array, and you cannot add or remove elements from it—only modify existing ones.");

        }

        //Проитерировать список через for-each и отпечатать слова в консоль через пробел

        for (String figure : figures) {
            System.out.print(figure + " ");
        }

    }
}


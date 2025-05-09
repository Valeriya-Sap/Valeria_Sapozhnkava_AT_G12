package homework.day6_Stream_API;

import homework.lists_classes.Water;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WaterRunner {
    public static void main(String[] args) {
//Создать поток данных water класса Water (через new Stream.of)
//из 4 объектов воды с цветом (Прозрачная, Прозрачная, Мутная, Синяя) и запахом (Нет, Нет, Аммиачный, Мятный) соответственно
//Отфильтровать воду, цвет которой не "Прозрачная"
//Отсортировать в нисходящем порядке по запаху
//На основании существующего потока данных создать новый, в котором каждая новая Water имеет запах с удвоенной буквой ы,
// если такая встречается
//Обьединить запах всех обьектов в одну строку
//Найти количество буков в ней и отпечатаь в консоль

        Stream<Water> waters = Stream.of(
                new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный")
        );

        System.out.println(waters.filter(n -> !n.getColor().equals("Прозрачная")).sorted((p1, p2) -> p2.getSmell()
                .compareTo(p1.getSmell())).map(n -> {
            if (n.getSmell().contains("ы")) {
                return new Water(n.getColor(), n.getSmell().replace("ы", "ыы"));
            } else {
                return n;
            }
        }).map(n -> n.getSmell()).reduce("", (s1, s2) -> s1 + s2).length());

    }
}

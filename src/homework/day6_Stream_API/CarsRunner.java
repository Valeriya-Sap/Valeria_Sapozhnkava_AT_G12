package homework.day6_Stream_API;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class CarsRunner {
    public static void main(String[] args) {
//Создать поток данных стрингов из 7 авто (Мерс, Ауди, Жигуль, Рено, Жигуль, Жигуль, Ауди) (через Stream.of())
//Оставить в потоке только уникальные названия авто
//Отфильтровать только те названия, которые содержат букву "и"
//Пропустить 1 название
//Все названия привести в верхний регистр
//Отпечатать все названия в консоль с новой строки

        System.out.println(Stream.of("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди").
                distinct().filter(string -> string.contains("и")).skip(1).map(string -> string.toUpperCase()).toList());

    }
}

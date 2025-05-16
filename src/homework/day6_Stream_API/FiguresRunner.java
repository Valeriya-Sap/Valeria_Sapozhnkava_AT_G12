package homework.day6_Stream_API;

import java.util.stream.Stream;

public class FiguresRunner {
    public static void main(String[] args) {
//        Создать список строк стрингов figures из 5 фигур (Овал, Прямоугольник, Круг, Квадрат, Эллипс) через (Stream.of())
//        Заменить каждое слово на целое число, соответствующее количеству буков в слове
//        Отфильтровать числа, которые больше 4
//        Отпечатать все оставшиеся числа в консоль

        Stream.of("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс")
                .map(string -> string.length()).filter(length -> length > 4)
                .forEach(System.out:: println);
    }
}

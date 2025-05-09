package homework.day6_Stream_API;

import java.util.stream.Stream;

public class NumbersRunner {
    public static void main(String[] args) {
//Создать поток данных целых чисел numbers из 8 чисел (3342, 34, 79, 23426, 68, 1324, 55, 7699) через (Stream.of())
//В потоке данных проитерировать числа и отпечатать числа в консоль новой строки
//Отсортировать и снова отпечатать в консоль с новой строки
//Посчитать сумму всех чисел и вывести результат в консоль
        Stream.of(3342, 34, 79, 23426, 68, 1324, 55, 7699).peek(s -> System.out.println(s)).sorted()
                .peek(s -> System.out.println(s)).mapToInt(s -> s.intValue()).sum();
    }
}

package homework.day6_Stream_API;

import java.util.Comparator;
import java.util.stream.Stream;

public class NumbersModRunner {
    public static void main(String[] args) {
//Создать поток данных целых чисел numbersMod из 8 чисел (626, 435, 9, 1463268, 24, 2237, 33, 9090) через (Stream.of())
//Отфильтровать те числа, которые содержать цифру 3
//Разбить числа на отдельные цифры и заменить цифры соответствующими словами
//Оставить только уникальные слова, отсортировать в нисходящем порядке и отпечатать в консоль с новой строки
        Stream.of(626, 435, 9, 1463268, 24, 2237, 33, 9090)
                .filter(s -> s.toString().contains("3")).flatMap(s -> s.toString().chars()
                        .mapToObj(a -> {
                            if (a == '0') {
                                return "zero";
                            } else if (a == '1') {
                                return "one";
                            } else if (a == '2') {
                                return "two";
                            } else if (a == '3') {
                                return "three";
                            } else if (a == '4') {
                                return "four";
                            } else if (a == '5') {
                                return "five";
                            } else if (a == '6') {
                                return "six";
                            } else if (a == '7') {
                                return "seven";
                            } else if (a == '8') {
                                return "eight";
                            } else {
                                return "nine";
                            }
                        })).distinct().sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}


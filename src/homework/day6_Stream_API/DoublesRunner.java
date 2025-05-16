package homework.day6_Stream_API;

import homework.lists_classes.Bubble;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.Random;

public class DoublesRunner {
    public static void main(String[] args) {
//Создать поток данных дробных чисел doubles из 8 чисел (33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9) через (Stream.of())
//Округлить каждое число до целого
//На основании этого потока сгенерировать новый поток данных целых чисел из случайных чисел с границами от 0 до числа из иходного потока данных
//Убрать дубликаты значений
//Заменить каждое число в получившемся потоке данных новым потоком состоящим из обьектов Bubble в количестве равному заменяемому числу,
//создавая обьекты с обьемом равным числу из исходного потока и именем по маске "Bubble vol-" + i, где i - число из исходного потока
//Отпечатать в консоль каждый из обьектов нового потока с новой строки
//Найти общий обьем полученного потока пузырьков и отпечатать в консоль
        Random random = new Random();
        System.out.println(Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9).map(s -> Math.round(s))
                .map(n -> random.nextInt((n.intValue()))).distinct()
                .flatMap(n -> {
                    List<Bubble> bubbleList = new ArrayList<>();
                    for (int i = 0; i < n; i++) {
                       bubbleList.add(new Bubble(n, "Bubble vol-" + n));
                    }
                    return bubbleList.stream();
                }).peek(System.out::println).mapToInt(n->n.getVolume()).sum());
    }
}

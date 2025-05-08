package homework.day6_Stream_API;

import homework.lists_classes.Bubble;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BubblesListRunner {
    public static void main(String[] args) {
//Создать список пузырей (класса Bubble) bubbles из 3 пузырьков с обьемами (2, 4, 5) и именами (CO2, O2, CO) соответственно,
// через (Arrays.asList())
        List<Bubble> bubbles = Arrays.asList(
                new Bubble(2, "CO2"),
                new Bubble(4, "O2"),
                new Bubble(5, "C")
        );
//В потоке данных отфельтровать только те пузыри, обьем которых больше 3
//Отсортировать данные по имени в восходящем порядке
//На основании существующего потока данных создать новый, в котором каждый новый Bubble имеет обьем в 3 раза больше исходного
//Вычислить сумму конечного обьема всех пузырей и отпечатать в консоль
        System.out.println(bubbles.stream().filter(n -> n.getVolume() > 3).sorted(Comparator.comparing(Bubble::getName))
                .map(n -> new Bubble(n.getVolume() * 3, n.getName()))
                .peek(System.out::println).mapToInt(n -> n.getVolume()).sum());
    }
}

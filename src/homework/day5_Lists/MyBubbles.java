package homework.day5_Lists;

import homework.lists_classes.Bubble;

import java.util.Arrays;
import java.util.List;

public class MyBubbles {
    public static void main(String[] args) {
//        Создать список пузырей (класса Bubble) bubbles из 3 пузырьков с объемами (2, 4, 5) и именами (CO2, O2, CO)
//        соответственно, через (Arrays.asList())

        List<Bubble> bubbles = Arrays.asList(
                new Bubble(2, "CO2"),
                new Bubble(4, "O2"),
                new Bubble(5, "CO")
        );

//        Проитерировать список через for-each и отпечатать объемы в консоль через пробел

        for (Bubble bubble : bubbles) {
            System.out.print(bubble.getVolume() + " ");
        }

        System.out.println();

//        Проитерировать список через for-each и отпечатать имена в консоль через пробел

        for (Bubble bubble : bubbles) {
            System.out.print(bubble.getName() + " ");
        }

        System.out.println();

//        Посчитать объем всех пузырей и вывести число в консоль

        int volume = 0;
        for (Bubble bubble : bubbles) {
            volume = volume + bubble.getVolume();
        }

        System.out.println(volume);

//        Проитерировать список по индексу и отпечатать пузыри (.toString()) в консоль с новой строки

        for (int i = 0; i < bubbles.size(); i++) {
            System.out.println(bubbles.get(i));
        }

    }
}

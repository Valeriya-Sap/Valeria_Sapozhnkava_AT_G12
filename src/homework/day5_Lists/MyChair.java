package homework.day5_Lists;

import homework.lists_classes.Chair;
import homework.lists_classes.Sand;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyChair {
    public static void main(String[] args) {
//        Создать список стульев (класса Chair) furniture из 3 стульев высотой (1, 4, 2)
//        и шириной (2, 2, 4) соответственно, через (Arrays.asList())

        List<Chair> furniture = Arrays.asList(
                new Chair(1, 2),
                new Chair(4, 2),
                new Chair(2, 4)
        );

//        Проитерировать список через for-each и отпечатать произведение высоты на ширину в консоль через пробел

        for (Chair chair : furniture) {
            System.out.print((chair.getHeight() * chair.getWidth()) + " ");
        }

//        Создать пустую карту, где ключом является целое число, а значением объект стула

        Map<Integer, Chair> mapChair = new HashMap<>();

//        Заполнить карту значениями из предыдущего списка, используя в качестве ключа любое уникальное число

        for (int i = 0; i < furniture.size(); i++) {
            mapChair.put(i, furniture.get(i));
        }

//        Проитерировать карту и отпечатать ключи в консоль

        for (Integer key : mapChair.keySet()) {
            System.out.println(key);
        }

//        Проитерировать карту и отпечатать значения в консоль

        for (Chair value : mapChair.values()) {
            System.out.println(value);
        }

//        Проитерировать карту и отпечатать пары ключ-значение в консоль

        for (Map.Entry<Integer, Chair> chair : mapChair.entrySet()) {
            System.out.println(chair);
        }
    }
}

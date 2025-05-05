package homework.day5_Lists;

import java.util.Arrays;
import java.util.List;

public class MyDoubles {
    public static void main(String[] args) {
//Создать список дробных чисел doubles из 8 чисел (33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9) через (Arrays.asList())

        List<Double> doubles = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

//Проитерировать список через for-each и отпечатать числа в консоль через пробел

        for (Double number : doubles) {
            System.out.print(number + " ");
        }

//Посчитать произведение всех чисел и вывести результат в консоль

        double multipl = 1;

        for (Double number : doubles) {
            multipl = multipl * number;
        }

        System.out.println();
        System.out.println(multipl);

//найти сумму всех дробных частей и вывести результат в консоль

        double sum = 0;
        for (Double number : doubles) {
            sum = sum + (number - number.intValue());
        }

        System.out.println(sum);


//Проитерировать список по индексу и вывести целые части в консоль через пробел

        for (int i = 0; i < doubles.size(); i++) {
            System.out.print(doubles.get(i).intValue() + " ");
        }
    }
}

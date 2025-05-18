package homework.day5_Lists;

import java.util.Arrays;
import java.util.List;

public class MyNumbers {
    public static void main(String[] args) {
//Создать список целых чисел numbers из 8 чисел (3342, 34, 79, 23426, 68, 1324, 55, 7699) через (Arrays.asList())

        List<Integer> numbers = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);

//Проитерировать список через for-each и отпечатать числа в консоль новой строки

        for (Integer number : numbers) {
            System.out.println(number);
        }

//Посчитать сумму всех чисел и вывести результат в консоль
        int sum = 0;
        for (Integer number : numbers) {
            sum = sum + number;
        }

        System.out.println(sum);

//Отсортировать список по возрастанию

        for (int i = numbers.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }

//Проитерировать список по индексу и отпечатать числа в консоль через пробел

        for (int a = 0; a < numbers.size(); a++) {
            System.out.print(numbers.get(a) + " ");
        }
        System.out.println();

//Развернуть список в обратном порядке

        numbers = numbers.reversed();

//Проитерировать список через for-each и отпечатать числа в консоль через пробел

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }

}


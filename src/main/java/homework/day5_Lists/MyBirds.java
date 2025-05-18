package homework.day5_Lists;

import homework.day2.playground.essence.Matter;
import homework.lists_classes.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyBirds {
    public static void main(String[] args) {
        //Создать список строк birds из 5 птиц (Чайка, Дрозд, Бусел, Голубь, Воробей, Цапля) через (Arrays.asList())

        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        //Проитерировать список через for-each и отпечатать слова в консоль с новой строки в виде --Чайка--

        for (String bird : birds) {
            System.out.println("--" + bird + "--");
        }

        //Посчитать сколько птиц содержат больше 1 гласной и вывести в число в консоль

        int numberB = 0;
        Pattern x = Pattern.compile("[уеыаоэяиюёУЕЫАОЭЯИЮЁ]");

        for (String bird : birds) {
            if (x.matcher(bird).results().count() > 1) {
                numberB++;
            }
        }
        System.out.println(numberB);

        //Проитерировать список по индексу и отпечатать слова в консоль через пробел

        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }

        //Заменить 3-й элемент списка на Синица

        birds.set(3, "Синица");
        System.out.println();

        //Проитерировать список через for-each и отпечатать слова в консоль через пробел

        for (String bird : birds) {
            System.out.print(bird + " ");
        }
    }
}
package homework.day6_Stream_API;

import java.util.Arrays;
import java.util.List;

public class BirdsRunner {
    public static void main(String[] args) {
//Создать список строк birds из 5 птиц (Чайка, Дрозд, Бусел, Голубь, Воробей, Цапля) через (Arrays.asList())
// Создать из списка поток данных, заменить в каждую букву "о" на букву "а"
//Собрать все слова в одну строку в ниждем регистре
//Убрать все символы мягкого знака
//Разбить на новые строки по букве "б"
//Отпечатать в консоль с новой строки в виде --Чайка--

      Arrays.stream(Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля")
                .stream().map(s -> s.replace("о", "а"))
                .map(s -> s.toLowerCase())
                .reduce("", (s1, s2) -> s1 + s2)
                .replace("ь", "")
                .split("б")).skip(0).forEach(s -> System.out.println("--" + s + "--"));
    }
}

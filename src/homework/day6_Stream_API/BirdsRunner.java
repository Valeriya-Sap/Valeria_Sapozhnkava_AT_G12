package homework.day6_Stream_API;

import java.util.Arrays;
import java.util.List;

public class BirdsRunner {
    public static void main(String[] args) {
//Создать список строк birds из 5 птиц (Чайка, Дрозд, Бусел, Голубь, Воробей, Цапля) через (Arrays.asList())
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");
//Создать из списка поток данных, заменить в каждую букву "о" на букву "а"
//Собрать все слова в одну строку в ниждем регистре
//Убрать все символы мягкого знака
//Разбить на новые строки по букве "б"
//Отпечатать в консоль с новой строки в виде --Чайка--

        birds.stream().map(s -> s.replace("о", "а")).map(s -> s.toLowerCase()).
                map(s -> s.replace("ь", "")).
                flatMap(string -> Arrays.stream(string.split("б"))).
                forEach(s -> System.out.println("--" + s + "--"));
    }
}

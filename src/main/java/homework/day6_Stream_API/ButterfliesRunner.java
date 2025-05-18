package homework.day6_Stream_API;

import java.util.ArrayList;
import java.util.List;

public class ButterfliesRunner {
    public static void main(String[] args) {
//        Создать пустой список стрингов butterflies (через new ArrayList)
//        Добавить в список 4 бабочки (Common blue, Swallowtail, Aglais io, Common blue)
        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");
//        Добавить к каждому элементу кавычки
//        Оставить только те слова, которые содержат букву "a" и букву "о"
//        Вывести слова в консоль с новой строки
        butterflies.stream().map(string -> "\"" + string + "\"").filter(string -> string.contains("a") &&
                string.contains("o")).forEach(string -> System.out.println(string));
    }
}

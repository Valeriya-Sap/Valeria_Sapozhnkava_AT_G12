package homework.day6_Stream_API;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Stream;

public class ElementsRunner {
    public static void main(String[] args) {
//Создать поток данных стрингов elements (Text field, Radio, Check-box, Drop-down, Picker, Breadcrumb) (через Stream.of())
//Для каждого элемента стрима пробежаться по отдельным словам и если слово нечетное, то заменить в нем все буквы "e"
// на букву "o", а если четное, то заменить слово на число количества буков в этом слове
//Оставить в потоке только уникальные значения
//Отпечатать в консоль с новой строки

        Stream.of("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb")
                .flatMap(string -> Arrays.stream(string.split(" ")))
                .map(s -> {
                    if (s.length() % 2 == 0) {
                        Integer n = s.length();
                        return n.toString();
                    } else {
                        return s.replace("e", "o");
                    }
                }).toList().stream().distinct().forEach(s -> System.out.println(s));
    }
}

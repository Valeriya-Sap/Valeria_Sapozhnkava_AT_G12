package homework.day6_Stream_API;

import java.util.stream.Stream;

public class CountriesRunner {
    public static void main(String[] args) {
//Создать поток данных стрингов countries из 4 стран (Андора, Португалия, Англия, Замбия) (через Stream.of())
//Отфильтровать страны, которые содержат в себе хотя бы одну гласную букву
//Отфильтровать страны, в названии которых меньше 7 букв
//Перевести все страны в верхний регистр
//Добавить к каждому названию кавычки
//Отпечатать в консоль с новой строки
        Stream.of("Андора", "Португалия", "Англия", "Замбия").
                  filter(s-> s.matches(".*[уеыаоэяиюёУЕЫАОЭЯИЮЁ].*")).
        filter(s -> s.length() < 7).map(s -> s.toUpperCase()).map(string -> "\"" + string + "\"").
                forEach(s -> System.out.println(s));
    }
}

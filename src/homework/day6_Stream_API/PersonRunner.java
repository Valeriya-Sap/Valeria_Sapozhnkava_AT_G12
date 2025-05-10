package homework.day6_Stream_API;

import homework.lists_classes.Person;

import java.io.*;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class PersonRunner {
    public static void main(String[] args) {
        //Создать поток данных people класса Person (через new Stream.of) с возрастом (32, 24, 55, 63) и
        // именами (Коля, Оля, Вася, Маша) соответственно

        Stream<Person> people = Stream.of(
                new Person(32, "Коля"),
                new Person(24, "Оля"),
                new Person(55, "Вася"),
                new Person(63, "Маша")
        );

        //Отфильтровать людей, которые моложе 60
        //Отсортировать в восходящем порядке по именам
        //На основании существующего потока данных создать новый, в котором каждый новый Person имеет возраст
        // на 4 года больше исходного
        //Вычислить средний возраст конечного людей и отпечатать в новый текстовый файл

        Double averageAge = people.filter(n -> n.getAge() < 60)
                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).peek(System.out::println)
                .map(n -> new Person(n.getAge() + 4, n.getName()))
                .mapToInt(n -> n.getAge()).average().getAsDouble();


        try (BufferedWriter out = new BufferedWriter(new FileWriter("averageAge.tmp"))) {
            out.write(averageAge.toString());
        } catch (IOException e) {
            System.out.println("There is some exception!");
        }
    }

}

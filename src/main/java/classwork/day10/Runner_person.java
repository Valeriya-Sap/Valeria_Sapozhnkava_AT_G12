package classwork.day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Runner_person {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));

        int number = 0;

        for (int i = 0; i <= people.size() - 1; i++) {
            Person anyPerson = people.get(i);

            if (anyPerson.sex.equals(Person.Sex.MAN) && anyPerson.age >= 18 && anyPerson.age <= 60
                    || anyPerson.sex.equals(Person.Sex.WOMEN) && anyPerson.age >= 18 && anyPerson.age <= 55) {
                number++;
            }
        }
        System.out.println(number);

        System.out.println(people.stream().filter(anyPerson -> anyPerson.sex.equals(Person.Sex.MAN) && anyPerson.age >= 18 && anyPerson.age <= 60
                || anyPerson.sex.equals(Person.Sex.WOMEN) && anyPerson.age >= 18 && anyPerson.age <= 55).count());

        System.out.println(people.stream().sorted((person1, person2) -> {
            if (person1.sex.compareTo(person2.sex) != 0) {
                return person1.sex.compareTo(person2.sex);
            } else {
                return person1.age - person2.age;
            }
        }).toList());

        System.out.println(people.stream().sorted((person1, person2) -> person1.age - person2.age).findFirst().get());
    }
}

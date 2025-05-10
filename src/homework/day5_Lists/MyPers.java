package homework.day5_Lists;

import homework.lists_classes.Person;

import java.util.ArrayList;
import java.util.List;

public class MyPers {
    public static void main(String[] args) {
//Создать пустой список людей (класса Person) people (через new ArrayList)

        List<Person> people = new ArrayList<>();

//Заполнить 4 людьми с возрастом (32, 24, 55, 63) и именами (Коля, Оля, Вася, Маша) соответственно

        people.add(new Person(32, "Коля"));
        people.add(new Person(24, "Оля"));
        people.add(new Person(55, "Вася"));
        people.add(new Person(63, "Маша"));

//Проитерировать список через for-each и отпечатать возраст в консоль через пробел

        for (Person pers : people) {
            System.out.print(pers.getAge() + " ");
        }

        System.out.println();

//Проитерировать список через for-each и отпечатать имена в консоль через пробел

        for (Person pers : people) {
            System.out.print(pers.getName() + " ");
        }

//Проитерировать список по индексу и отпечатать людей (.toString()) в консоль с новой строки

        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }
    }
}

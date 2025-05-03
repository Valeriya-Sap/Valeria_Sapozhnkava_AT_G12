package classwork.day10;

import java.util.Arrays;
import java.util.List;

public class MyStreamOne {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        long number = list.stream().filter("мама"::equals).count();

        System.out.println(number);

        System.out.println(list.stream().findFirst().orElse("мама"));

        System.out.println(list.stream().filter("мама"::equals).findFirst().get());

        System.out.println(list.stream().skip(4).findFirst().get());

        System.out.println(list.stream().skip(2).limit(2).toList());

        System.out.println(list.stream().distinct().filter(t -> t.contains("м")).toList());
    }
}
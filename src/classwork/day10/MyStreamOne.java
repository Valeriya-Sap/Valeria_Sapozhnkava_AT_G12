package classwork.day10;

import java.util.Arrays;
import java.util.Comparator;
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
//--------------------------------------------------------------------------------------------------------
        System.out.println(list.stream().anyMatch("мама"::equals));

        System.out.println(list.stream().allMatch("м"::contains));

        System.out.println(list.stream().map(string -> string + "м").toList());

        System.out.println(list.stream().flatMap(string -> Arrays.stream(string.split("а"))).filter
                (x -> !x.isEmpty()).toList());
//--------------------------------------------------------------------------------------------------------

        System.out.println(list.stream().sorted().toList());

        System.out.println(list.stream().sorted(Comparator.reverseOrder()).distinct().toList());

        System.out.println(list.stream().flatMap(string -> Arrays.stream(string.split(""))).peek(p-> System.out.println(p)).max(String::compareTo).get());

    }
}
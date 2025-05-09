package homework.day6_Stream_API;

import homework.lists_classes.Sand;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SandboxRunner {
    public static void main(String[] args) {
//Создать пустой список песка (класса Sand) sandbox (через new ArrayList
// Заполнить 5 объектами песка с весом (12, 8, 15, 7, 11) и именами (Речной, Речной, Карьерный, Карьерный, Речной) соответственно

        List<Sand> sandbox = new ArrayList<>();

        sandbox.add(new Sand(12, "Речной"));
        sandbox.add(new Sand(8, "Речной"));
        sandbox.add(new Sand(15, "Карьерный"));
        sandbox.add(new Sand(7, "Карьерный"));
        sandbox.add(new Sand(11, "Речной"));

//Отфильтровать только тот песок, который весит больше 9 и имя которого содержит букву "ч"
//Отсортировать по весу в восходящем порядке
//На основании существующего потока данных создать новый, в котором каждый новый Sand имеет вес умноженный на 2,
// и имя в верхнем регистре
//На основании получившегося потока данных создать коллекцию Map, где ключ - это вес, а значение - имя
//Отпечатать каждый из элементов карты в виде value:key в текстовый файл
        Map<Integer, String> sandMap = sandbox.stream().filter(n -> n.getWeight() > 9 && n.getName().contains("ч"))
                .sorted((w1, w2) -> Integer.compare(w1.getWeight(), w2.getWeight()))
                .map(n -> new Sand(n.getWeight() * 2, n.getName().toUpperCase()))
                .collect(Collectors.toMap(s1 -> s1.getWeight(), s1 -> s1.getName()));

        try (BufferedWriter out = new BufferedWriter(new FileWriter("sandmap.tmp"))) {
            for (Map.Entry<Integer, String> entry : sandMap.entrySet()) {
                out.write(entry.getValue() + ":" + entry.getKey());
                out.newLine();
            }
        } catch (IOException e) {
            System.out.println("There is some exception!");
        }

    }
}

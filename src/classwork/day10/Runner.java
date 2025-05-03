package classwork.day10;

public class Runner {

    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.justMethod(System.out::println);
    }
}

package homework.day4;

public class GenericMethodsInGenericClassT<T> {
    void genericMethodOneGenArg(T x) {
        System.out.printf("I am an object of '%s' class", x.getClass().getSimpleName());
    }

    String genericMethodTwoGenArgs(T x, T y) {
        String message = String.format("We are objects of '%s' class and '%s' class", x.getClass().getSimpleName(), y.
                getClass().getSimpleName());
        return message;
    }

    void genericMethodHalfGenArgs(T x, String incoming) {
        int number = incoming.length();
        System.out.printf("I got an object of '%s' class and string with '%d' characters", x.getClass().getSimpleName(), number);
    }

}

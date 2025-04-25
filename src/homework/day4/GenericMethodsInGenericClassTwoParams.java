package homework.day4;

public class GenericMethodsInGenericClassTwoParams<X, Y> {
    String genericMethodGenArgs(X a) {
        String message = String.format("I received 1 argument of type: '%s' class.", a.getClass().getSimpleName());
        return message;
    }

    String genericMethodGenArgs(X a, Y b) {
        String message = String.format("I received 2 arguments of type: '%s' class and '%s' .", a.getClass().getSimpleName(), b.getClass().getSimpleName());
        return message;
    }

    void genericMethodHalfGenArgs(X a, String incoming) {
        int number = incoming.length();
        System.out.printf(String.format("I got an object of '%s' class and string with '%d' characters. ", a.getClass().getSimpleName(), number));
    }

//    void genericMethodHalfGenArgs(Y b, String incoming) {
//        int number = incoming.length();
//        System.out.printf(String.format("I got an object of '%s' class and string with '%d' characters. ", b.getClass().getSimpleName(), number));
//    }

    void genericMethodHalfGenArgs(X a, Y b, String incoming) {
        int number = incoming.length();
        System.out.printf(String.format("I got an object of '%s' class and '%s' class and string with '%d' characters.", a.getClass().getSimpleName(), b.getClass().getSimpleName(), number));
    }
}

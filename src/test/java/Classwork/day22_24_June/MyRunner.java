package Classwork.day22_24_June;

import java.io.IOException;

public class MyRunner {
    public static void main(String[] args) throws IOException {
       MyJSONParser parser1 = new MyJSONParser();
        parser1.toJson();
        parser1.fromJson();
    }
}

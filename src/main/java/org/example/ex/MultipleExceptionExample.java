package org.example.ex;

import java.io.FileNotFoundException;
import java.text.ParseException;

public class MultipleExceptionExample {
    public static void main(String[] args) {
        try {
            doSomething1();
            doSomething2();
        } catch (FileNotFoundException | ParseException e) {
            e.printStackTrace();
        }

        // For multiple exception we should write it as (...Exception | ...Exception e) - with one variable
    }

    private static void doSomething1() throws FileNotFoundException {
        System.out.println("I do something in the 1st method");
    }

    private static void doSomething2() throws ParseException {
        System.out.println("I do something in the 2nd method");
    }
}

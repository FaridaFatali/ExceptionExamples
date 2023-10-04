package org.example;

public class ErrorExample {
    public static void main(String[] args) {
        //We'll get an error, because we didn't catch it in throwError1() method
//        throwError1();

        // We don't get an error here, because we use try-catch
//        throwError2();

        // We'll get StackOverflowError if we don't use try-catch, because it's a recursive method
        try {
            recursiveMethod();
        } catch (Throwable e) {
            System.out.println("It's a recursive method");
        }
    }

    public static void throwError1() {
        System.out.println("I'll throw an error now! - throwError1");
        throw new OutOfMemoryError("Just an error!");
    }

    public static void throwError2() {
        System.out.println("I'll throw an error now! - throwError2");

        try {
            throw new OutOfMemoryError("Just an error!");
        } catch (OutOfMemoryError e) {
            System.out.println(e.getMessage());
        }
    }

    public static void recursiveMethod() {
        recursiveMethod();
    }
}

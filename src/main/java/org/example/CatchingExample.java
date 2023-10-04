package org.example;

public class CatchingExample {
    public static void main(String[] args) {
        // We'll get an error if we use it like this:
//        doSomething();

        try {
            doSomething();
            System.out.println("After doSomething()1");
        } catch (Throwable e) {
            System.out.println("After doSomething()2");
        }
    }

    public static void doSomething() throws Throwable {
        doSomethingElse();
    }

    public static void doSomethingElse() throws Throwable {
        throwAThrowable();
    }

    public static void throwAThrowable() throws Throwable {
        double random = Math.random();

        if (random < 0.5) {
            System.out.println("I have a problem while I'm doing my work. Random: " + random);
            throw new Throwable("Just an exception!");
        } else {
            System.out.println("I'm doing my work without any problem at all.");
        }
    }
}
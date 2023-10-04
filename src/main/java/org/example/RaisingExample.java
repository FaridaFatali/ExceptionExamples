package org.example;

public class RaisingExample {

    // It's not a useful way. We have to catch it at least in main() method. There isn't anyone to catch it after main()
    public static void main(String[] args) throws Throwable {
        doSomething();
        System.out.println("After doSomething()!");
    }

    public static void doSomething() throws Throwable {
        doSomethingElse();
    }

    public static void doSomethingElse() throws Throwable {
        throwAThrowable();
    }

    public static void throwAThrowable() throws Throwable {
//        Throwable throwable = new Throwable("Just an exception!");
//        throw throwable;

        throw new Throwable("Just an exception!");
    }
}

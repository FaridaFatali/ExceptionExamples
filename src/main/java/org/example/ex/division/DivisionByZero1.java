package org.example.ex.division;

public class DivisionByZero1 {
    public static void main(String[] args) {
        // We'll get ArithmeticException because of division to 0
        divide(20, 0);
        System.out.println("After divide() method");
    }

    public static void divide(int num1, int num2) {
        System.out.println("in divide() with arguments: " + num1 + " and " + num2);
        int division = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + division);
    }
}

package org.example.ex.division;

public class DivisionByZero4 {
    public static void main(String[] args) {
        System.out.println("in main(), before calling divide() method");

        try {
            divide(20, 0);
            System.out.println("in main(), just after calling divide() method");
        } catch (ArithmeticException e) {
            System.out.println("Problem with the division");
            System.out.println("Message: " + e.getMessage());
            divide(20, 10);
        }
    }

    public static void divide(int num1, int num2) {
        System.out.println("in divide() with arguments: " + num1 + " and " + num2);

        if (num2 == 0) {
            throw new ArithmeticException("You can't divide to 0");
        } else {
            int division = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + division);
        }
    }
}

package org.example.assertion;

import java.util.Scanner;

public class SwitchDemoWithAssertion {
    public static void main(String[] args) {
        System.out.println("A number: ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> {
                // Before using assert you should turn on it on Run > Run Configurations > Arguments and write there -ea
                assert false : "Error! Please enter the month number between 1 and 12";
                // After checking it, fixing the code, you should close assert on the same configurations by deleting -ea
            }
        }
    }
}

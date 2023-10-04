package org.example.ex.division;

import org.example.ex.ScannerUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DivisionByZero5 {
    public static void main(String[] args) {
        String path = ScannerUtil.read("Please enter the path of the file to open:");
        File file = new File(path);

        System.out.println("in main(), before calling divide() method");

        try {
            InputStream in = new FileInputStream(file);
            System.out.println("File opened!");
            divide(20, 0);
            in.close();
            System.out.println("File closed!");
            divide(20, 0);
            System.out.println("in main(), just after calling divide() method\n");
        } catch (ArithmeticException | IOException e) {
            System.out.println("Problem with the division");
            System.out.println("Message: " + e.getMessage());
            divide(20, 10);
        }
        System.out.println("in main(), after calling divide() method");

    }

    public static void divide(int num1, int num2) throws ArithmeticException {
        System.out.println("in divide() with arguments: " + num1 + " and " + num2);

        if (num2 == 0) {
            throw new ArithmeticException("You can't divide to 0");
        } else {
            int division = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + division);
        }
    }
}

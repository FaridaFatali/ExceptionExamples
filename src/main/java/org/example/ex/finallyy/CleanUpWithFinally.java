package org.example.ex.finallyy;

import java.io.*;
import java.util.*;

public class CleanUpWithFinally {
    private static List<Integer> list = new ArrayList<>();
    private static final int SIZE = 10;

    public static void main(String[] args) {
        populateList();
        writeList();
    }

    public static void populateList() {
        for (int i = 0; i < SIZE; i++) {
            list.add((int) (10 * i * Math.random()));
        }
    }

    public static void writeList() {
        PrintWriter out = null;
        System.out.println("Entered try statement");

        try {
            out = new PrintWriter(new FileWriter("C:\\Users\\User\\Desktop\\a.txt"));
            for (int i = 0; i < SIZE; i++) {
                out.println("Value at: " + i + " = " + list.get(i));
                if (i == 8) {
                    throw new IOException("Just trying something.");
                }
            }
            out.close();
            out = null;
        } catch (IOException e) {
            System.out.println("Problem when writing out to the file: " + e.getMessage());
        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
                out = null;
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }
}

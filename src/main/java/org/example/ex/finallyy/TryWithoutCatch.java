package org.example.ex.finallyy;

import java.io.*;

public class TryWithoutCatch {
    public static void main(String[] args) {
        try {
            trySomething();
            System.out.println("We call trySomething() in main() method");
        } catch (IOException e) {
            System.out.println("in catch()");
            System.out.println(e.getMessage());
        }
    }

    public static void trySomething() throws IOException {
        System.out.println("In trySomething() method");
        InputStream is = null;

        try {
            System.out.println("In try");
            is = new FileInputStream("C:\\Users\\User\\Desktop\\a.txt");

            is.close();
        } finally {
            System.out.println("In finally");
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void trySomethingElse() {
        System.out.println("In trySomethingElse() method");
        InputStream is = null;

        try {
            System.out.println("In try");
            try {
                is = new FileInputStream("");
//                is = new FileInputStream("C:\\Users\\User\\Desktop\\a.txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } finally {
            System.out.println("In finally");
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

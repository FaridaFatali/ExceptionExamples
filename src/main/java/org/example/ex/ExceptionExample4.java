package org.example.ex;

import java.io.*;

public class ExceptionExample4 {
    public static void main(String[] args) {
        String path = ScannerUtil.read("Please enter the path of the file to open:");

        try {
            openAndCloseFile1(path);
        } catch (FileNotFoundException e) {
            System.out.println(e.getClass().getName());
            System.out.println("Problem with closing the file: " + path);
            System.out.println("Message: " + e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getClass().getName());
            System.out.println("Problem with opening the file: " + path);
            System.out.println("Message: " + e.getMessage());
        }

        try {
            openAndCloseFile1(path);
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
            System.out.println("Problem with opening the file: " + path);
            System.out.println("Message: " + e.getMessage());
        }

        try {
            openAndCloseFile2(path);
        } catch (IOException e) {
            System.out.println(e.getClass().getName());
            System.out.println("Problem with opening the file: " + path);
            System.out.println("Message: " + e.getMessage());
        }

        try {
            openAndCloseFile3(path);
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
            System.out.println("Problem with opening the file: " + path);
            System.out.println("Message: " + e.getMessage());
        }

        try {
            openAndCloseFile4(path);
        } catch (Throwable e) {
            System.out.println(e.getClass().getName());
            System.out.println("Problem with opening the file: " + path);
            System.out.println("Message: " + e.getMessage());
        }
    }

    private static void openAndCloseFile1(String path) throws IOException, FileNotFoundException {
        File file = new File(path);
        InputStream in = new FileInputStream(file);
        System.out.println("File opened!");
        in.close();
        System.out.println("File closed!");
    }

    private static void openAndCloseFile2(String path) throws IOException {
        File file = new File(path);
        InputStream in = new FileInputStream(file);
        System.out.println("File opened!");
        in.close();
        System.out.println("File closed!");
    }

    private static void openAndCloseFile3(String path) throws Exception {
        File file = new File(path);
        InputStream in = new FileInputStream(file);
        System.out.println("File opened!");
        in.close();
        System.out.println("File closed!");
    }

    // Can't declare an exception type that isn't the parent of the actually thrown object
    // For example. we can't write throws ArithmeticException, it isn't inside IOException hierarchy
    private static void openAndCloseFile4(String path) throws Throwable {
        File file = new File(path);
        InputStream in = new FileInputStream(file);
        System.out.println("File opened!");
        in.close();
        System.out.println("File closed!");
    }
}

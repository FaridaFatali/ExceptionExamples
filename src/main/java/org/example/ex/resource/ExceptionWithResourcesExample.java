package org.example.ex.resource;

import org.example.ex.ScannerUtil;

import java.io.*;

public class ExceptionWithResourcesExample {
    public static void main(String[] args) throws IOException {
        String path = ScannerUtil.read("Please enter the path of the file to open:");
        openFile(path);
        System.out.println("---------------");
        openAndCloseFile(path);
    }

    private static void openFile(String path) throws IOException {
        File file = new File(path);
        InputStream in = null;

        try {
            in = new FileInputStream(file);
            System.out.println("File opened!");
            doSomethingWithFile(in);
            in.close();
        } catch (FileNotFoundException e) {
            in.close();
            System.out.println("Problem with opening the file: " + path);
            System.out.println("Message: " + e.getMessage());
        } catch (IOException e) {
            in.close();
            System.out.println("Problem with closing the file: " + path);
            System.out.println("Message: " + e.getMessage());
        } finally {
            if (in != null) {
                in.close();
            }
        }

        try (InputStream in2 = new FileInputStream(file)) {
            System.out.println("File opened!");
            doSomethingWithFile(in2);
        } catch (FileNotFoundException e) {
            System.out.println("Problem with opening the file: " + path);
            System.out.println("Message: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Problem with closing the file: " + path);
            System.out.println("Message: " + e.getMessage());
        }
    }

    private static void doSomethingWithFile(InputStream in) {
        System.out.println("Printing file to the console");

        try {
            int c;
            while ((c = in.read()) != -1) {
                System.out.println(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void openAndCloseFile(String path) {
        File file = new File(path);

        try {
            InputStream in = new FileInputStream(file);
            System.out.println("File opened!");
            in.close();
            System.out.println("File closed!");
        } catch (FileNotFoundException e) {
            System.out.println("Problem with opening the file: " + path);
            System.out.println("Message: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Problem with closing the file: " + path);
            System.out.println("Message: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

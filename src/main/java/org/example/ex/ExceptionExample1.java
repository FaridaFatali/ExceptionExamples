package org.example.ex;

import java.io.*;

// Example input: C:\Users\User\Desktop\a.txt
// When it asks, we should enter this path

public class ExceptionExample1 {
    public static void main(String[] args) {
    String path = ScannerUtil.read("Please enter the path of the file to open: ");
    openFile(path);
    openAndCloseFile(path);
    openAndCloseFile2(path);
    }

    private static void openFile(String path) {
        File file = new File(path);

        try {
            InputStream in = new FileInputStream(file);
            System.out.println("File opened!");
        } catch (FileNotFoundException e) {
            System.out.println("Problem with opening the file: " + path);
            System.out.println("Message: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void openAndCloseFile(String path) {
        File file = new File(path);

        try {
            InputStream in = new FileInputStream(file);
            System.out.println("File opened!");
            try {
                Thread.currentThread().sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int availableByteCount = in.available();
            System.out.println("Available Byte Count: " + availableByteCount);
            in.close();
            System.out.println("File closed!");
        } catch (FileNotFoundException e) {
            System.out.println("Problem with opening the file: " + path);
            System.out.println("Message: " + e.getMessage());
           // e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Problem with closing the file: " + path);
            System.out.println("Message: " + e.getMessage());
          //  e.printStackTrace();
        }
    }

    private static void openAndCloseFile2(String path) {
        File file = new File(path);

        try {
            OutputStream out = new FileOutputStream(file);
            System.out.println("File opened!");
            try {
                Thread.currentThread().sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            String s = "Java Forever!";
            byte[] bytes = s.getBytes("US-ASCII");
            out.write(bytes);
            out.close();
            System.out.println("File closed!");
        } catch (FileNotFoundException e) {
            System.out.println("Problem with opening the file: " + path);
            System.out.println("Message: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Problem with closing the file: " + path);
            System.out.println("Message: " + e.getMessage());
           // e.printStackTrace();
        }
    }
}

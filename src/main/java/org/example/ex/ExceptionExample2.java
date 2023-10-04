package org.example.ex;

import java.io.*;

public class ExceptionExample2 {
    public static void main(String[] args) {
        String path = ScannerUtil.read("Please enter the path of the file to open:");

        try {
            openAndCloseFile(path);
        } catch (IOException e) {
            System.out.println("Problem with closing the file: " + path);
            System.out.println("Message: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void openAndCloseFile(String path) throws IOException {
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
        }
    }
}

package org.example.ex;

import java.io.*;

public class ExceptionExample5 {

    // When we write the parent class first, then no need to write subclasses as Exception
//    public static void main(String[] args) {
//        String path = ScannerUtil.read("Please enter the path of the file to open:");
//
//        try {
//            openAndCloseFile1(path);
//        } catch (Exception e) {
//            System.out.println("Problem: " + path);
//            System.out.println("Message: " + e.getMessage());
//            e.printStackTrace();
//        } catch (IOException e) {
//            System.out.println("Problem with closing the file: " + path);
//            System.out.println("Message: " + e.getMessage());
//            e.printStackTrace();
//        } catch (FileNotFoundException e) {
//            System.out.println("Problem with opening the file: " + path);
//            System.out.println("Message: " + e.getMessage());
//            e.printStackTrace();
//        }
//    }

    // We only can write the specific subclass first, then the parent class
    public static void main(String[] args) {
        String path = ScannerUtil.read("Please enter the path of the file to open:");

        try {
            openAndCloseFile2(path);
        } catch (FileNotFoundException e) {
            System.out.println("Problem with closing the file: " + path);
            System.out.println("Message: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Problem with opening the file: " + path);
            System.out.println("Message: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void openAndCloseFile1(String path) throws IOException, FileNotFoundException {
        File file = new File(path);
        InputStream in = new FileInputStream(file);
        System.out.println("File opened!");
        in.close();
        System.out.println("File closed!");
    }

    private static void openAndCloseFile2(String path) throws FileNotFoundException, IOException {
        File file = new File(path);
        InputStream in = new FileInputStream(file);
        System.out.println("File opened!");
        in.close();
        System.out.println("File closed!");
    }
}

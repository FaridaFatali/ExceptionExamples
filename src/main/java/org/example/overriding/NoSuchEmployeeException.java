package org.example.overriding;

public class NoSuchEmployeeException extends Exception {
    public NoSuchEmployeeException(String message) {
        super(message);
    }
}

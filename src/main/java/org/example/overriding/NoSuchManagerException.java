package org.example.overriding;

public class NoSuchManagerException extends NoSuchEmployeeException {
    public NoSuchManagerException(String message) {
        super(message);
    }
}

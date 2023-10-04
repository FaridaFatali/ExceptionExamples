package org.example.shape1;

public class NegativeArgumentException extends RuntimeException{
    private double argument;

    public NegativeArgumentException(String message, double argument) {
        super(message);
        this.argument = argument;
    }

    public NegativeArgumentException(String message) {
        super(message);
    }

    public double getArgument(){
        return argument;
    }
}

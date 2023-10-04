package org.example.runtime;

import org.example.shape1.Circle;
import org.example.shape1.NegativeArgumentException;
import org.example.shape1.Shape;

public class RuntimeExceptionExample {
    public static void main(String[] args) {
        produceNullPointerException();
        produceArrayIndexOutOfBondsException();
        produceStringIndexOutOfBondsException();
//
        Shape shape = getMeAShape();
        System.out.println(shape.calculateArea());
    }

    public static void produceNullPointerException() {
        Shape shape = getMeAShape();
        shape.draw();

        // Without it, we'll get an exception
        if (shape != null) {
            shape.draw();
        } else {
            System.err.println("Shape is null!");
        }
    }

    public static Shape getMeAShape() {
        Shape shape = null;
        int i = (int) (Math.random() * 10);

        if (i > 5) {
            try {
                shape = new Circle(10);
            } catch (NegativeArgumentException e) {
                System.out.println("Your argument: " + e.getArgument());
            }
        }
        return shape;
    }

//    public static Shape getMeAShape() {
//        Shape shape = null;
//        int i = (int) (Math.random() * 10);
//
//        if (i > 5) {
//            try {
//                shape = new Circle(i);
//            } catch (NegativeArgumentException e) {
//                System.out.println("Your argument: " + e.getArgument());
//            }
//        } else {
//            try {
//                shape = new Circle(0);
//            } catch (NegativeArgumentException e) {
//
//            }
//            return shape;
//        }

    public static void produceArrayIndexOutOfBondsException() {
        int[] array = {1, 2, 3, 4, 5};

        for (int i : array) {
            System.out.println(i);
        }
        System.out.println(array[7]); // It should be less than 4
    }

    public static void produceStringIndexOutOfBondsException() {
        String s = "I love Java!";

        for (int i = 0; i <= 20; i++) { // It should be i < s.length() or s <= s.length() - 1
            System.out.println(s.charAt(i));
        }
    }
}

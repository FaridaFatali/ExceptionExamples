package org.example.shape1;

import java.util.Random;

public class ShapeFactory {
    public static Random random = new Random();

    public static Shape produceShape() {
        Shape shape;

        // When someone enters a negative number Math.abs() method always will make it positive:
        int i = Math.abs(random.nextInt() % 100);

        if (i % 2 == 0) {
            shape = new Circle(i);
        } else {
            shape = new Rectangle(i, 2 * i);
        }
        return shape;
    }
}

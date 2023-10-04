package org.example.shape2;

// Without creating our exception. If there is useful exception class on API, we don't need to create own exception

public class ShapeTest {
    public static void main(String[] args) {
        ShapeTest test = new ShapeTest();

        for (int i = 0; i < 5; i++) {
            Shape shape = ShapeFactory.produceShape();
            test.display(shape);
        }
    }

    public void display(Shape shape) {
        System.out.println();
        shape.draw();
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Circumference: " + shape.calculateCircumference());
    }
}

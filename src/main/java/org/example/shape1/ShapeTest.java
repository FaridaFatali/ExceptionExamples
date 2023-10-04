package org.example.shape1;

// With creating our Exception class

public class ShapeTest {
    public static void main(String[] args) {
        ShapeTest test = new ShapeTest();

        for (int i = 0; i < 5; i++) {
            Shape shape;
            shape = ShapeFactory.produceShape();

//            try {
//                shape = ShapeFactory.produceShape();
//            } catch (NegativeArgumentException e) {
//                processNegativeArgumentException(e);
//            }

            if (shape != null) {
                test.display(shape);
            }
        }
    }

    public void display(Shape shape) {
        System.out.println();
        shape.draw();
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Circumference: " + shape.calculateCircumference());
    }

    public static void processNegativeArgumentException(NegativeArgumentException e) {
        System.out.println("\n********************************");
        System.out.println(e.getMessage());
        System.out.println(e.getArgument());
        System.out.println("********************************\n");
    }
}

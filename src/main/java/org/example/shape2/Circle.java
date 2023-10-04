package org.example.shape2;

public class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Can't pass negative radius: " + radius);
        }

        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing the circle!");
    }

    @Override
    public void erase() {
        System.out.println("Erasing the circle!");
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

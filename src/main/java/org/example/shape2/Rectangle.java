package org.example.shape2;

public class Rectangle implements Shape {
    double shortSide;
    double longSide;

    public Rectangle(double shortSide, double longSide) {
        if (shortSide < 0) {
            throw new IllegalArgumentException("Can't pass negative values for short side: " + shortSide);
        }

        if (longSide < 0) {
            throw new IllegalArgumentException("Can't pass negative values for long side: " + longSide);
        }

        this.shortSide = shortSide;
        this.longSide = longSide;
    }

    @Override
    public void draw() {
        System.out.println("Drawing the rectangle!");
    }

    @Override
    public void erase() {
        System.out.println("Erasing the rectangle!");
    }

    @Override
    public double calculateArea() {
        return shortSide * longSide;
    }

    @Override
    public double calculateCircumference() {
        return shortSide + longSide;
    }
}

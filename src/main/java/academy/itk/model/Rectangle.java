package academy.itk.model;

import academy.itk.enums.ShapeType;

public class Rectangle extends Shape {

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        super(ShapeType.RECTANGLE);
        this.a = a;
        this.b = b;
    }

    public double calculateArea() {
        return a * b;
    }

    public double calculatePerimeter() {
        return 2 * (a + b);
    }
}

package academy.itk.model;

import academy.itk.enums.ShapeType;

public class Triangle extends Shape {

    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        super(ShapeType.TRIANGLE);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculateArea() {
        return calculatePerimeter() / 2;
    }

    public double calculatePerimeter() {
        return a + b + c;
    }
}

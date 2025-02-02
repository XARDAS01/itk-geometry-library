package academy.itk.model;

import academy.itk.enums.ShapeType;

public class Circle extends Shape {

    private final double r;

    public Circle(double r) {
        super(ShapeType.Circle);
        this.r = r;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(r, 2);
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * r;
    }
}

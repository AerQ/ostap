package AbstractShape.Circle;
import AbstractShape.AbstractShape;

public class Circle extends AbstractShape {

    private final double radius;
    final double pi = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return pi * Math.pow(radius, 2);
    }

    @Override
    public double getParameter() {
        return 2 * pi * radius;
    }
}
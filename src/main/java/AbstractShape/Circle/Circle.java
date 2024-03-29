package AbstractShape.Circle;

import AbstractShape.AbstractShape;

public class Circle extends AbstractShape implements Comparable<Circle> {

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
    public double getPerimeter() {
        return 2 * pi * radius;
    }
    @Override
    public String toString() {
        return(radius+""+pi);
    }

    @Override
    public int compareTo(Circle anotherCircle) {
        return this.getArea() == anotherCircle.getArea()? 0: this.getArea() == anotherCircle.getArea()? -1 :1;

    }
}
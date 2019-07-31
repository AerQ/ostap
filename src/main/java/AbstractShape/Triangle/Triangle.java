package AbstractShape.Triangle;

import AbstractShape.AbstractShape;

public class Triangle extends AbstractShape implements Comparable<Triangle> {

    private final double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {

        double s = (a + b + c) / 2;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }


    @Override
    public String toString() {
        return (a + " " + b + " " + c);
    }

    @Override
    public int compareTo(Triangle anotherTriangle) {
        if (this.getArea() == anotherTriangle.getArea()){
            return 0;
        }if (this.getArea() < anotherTriangle.getArea()){
            return -1;
        }else return 1;
    }

}

package AbstractShape.Square;

import AbstractShape.AbstractShape;

public class Squere extends AbstractShape {

    private final double width, height;

    public Squere(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width* height;
    }

    @Override
    public double getParameter() {
        return 2 * (width + height);
    }

}

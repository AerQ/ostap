package AbstractShape.Square;
import AbstractShape.AbstractShape;

public class Square extends AbstractShape implements Comparable<Square> {

    private final double width, height;

    public Square(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
    @Override
    public String toString() {
        return(width+" "+height);
    }

    @Override
    public int compareTo(Square anotherSquare) {
        return   this.getArea() == anotherSquare.getArea() ? 0 : this.getArea() < anotherSquare.getArea() ?  -1 : 1;

    }
}

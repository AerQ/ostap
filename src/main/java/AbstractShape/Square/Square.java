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

//    @Override
//    public int compare(Square o1, Square o2) {
//        if (o1.getArea() > o2.getArea())
//            return 1;
//        else if(o1.getArea()< o2.getArea())
//            return -1;
//        else
//            return 0;
//    }


    @Override
    public int compareTo(Square anotherSquare) {
        if (this.getArea() == anotherSquare.getArea()){
            return 0 ;
        }
        if (this.getArea() < anotherSquare.getArea()){
            return -1;
        }
        else {
            return 1;
        }
    }
}

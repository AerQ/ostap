package AbstractShape;



import java.util.Comparator;

abstract public class AbstractShape implements Shape{

    @Override
    public double getArea() {
        return 0;
    }

    abstract public double getPerimeter();

    @Override
    public String toString() {
        return super.toString();
    }

}

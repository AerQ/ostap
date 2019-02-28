package AbstractShape;

abstract public class AbstractShape implements Shape {

    @Override
    public double getArea() {
        return 0;
    }

    abstract public double getParameter();
}

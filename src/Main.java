import AbstractShape.Circle.Circle;
import AbstractShape.Square.Squere;
import AbstractShape.Triangle.Triangle;

public class Main {

    public static void main(String[] args) {

        Squere squere = new Squere(10,10);
        System.out.println("Площадь квадрата =" + squere.getArea());
        Squere squere1 = new Squere(10,10);
        System.out.println("Периметр квадрата =" + squere1.getParameter());
        Triangle triangle = new Triangle(2,2,2);
        System.out.println("Площадь квадрата =" + triangle.getArea());
        Triangle triangle1 = new Triangle(2,2,2);
        System.out.println("Периметр квадрата =" + triangle1.getParameter());
        Circle circle = new Circle(17);
        System.out.println("Площадь круга =" + circle.getArea());
        Circle circle1 = new Circle(17);
        System.out.println("Периметр круга =" + circle1.getArea());

    }
}

import AbstractShape.Circle.Circle;
import AbstractShape.Square.Square;
import AbstractShape.Triangle.Triangle;

import java.util.*;
import java.util.Collections;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Main {
    static private ArrayList<Circle> circles = new ArrayList<Circle>();
    static TreeSet<Square> squares = new TreeSet<Square>();
    static ArrayList<Triangle> triangles = new ArrayList<Triangle>();
    private static final Logger logger = Logger.getLogger("aerQ");

    public static void main(String[] args) {

        Square firstShape = new Square(25, 15);
        Square secondShape = new Square(3,7);
        Square thirdShape = new Square(14, 19);
        Square fourthShape = new Square(15, 19);
        Square fifthShape = new Square(16, 19);

        squares.add(firstShape);
        squares.add(secondShape);
        squares.add(thirdShape);
        squares.add(fourthShape);
        squares.add(fifthShape);


        Collections.sort(squares);
        Collections.min(squares);
    }
    }




//        final String ololo = "123456";
//        int sum = 0;
//
//        for(String singleChar : ololo.split("")) {
//            int parsed = Integer.parseInt(singleChar);
//            sum += parsed;
//        }
//        System.out.println(sum);
//
//
//
//    }


//
//        AbstractShape.Square.Square square = new AbstractShape.Square.Square(10,10);
//        logger.info("Area of the square is ="+ square.getArea() +"\n");
//        AbstractShape.Square.Square square1 = new AbstractShape.Square.Square(10,10);
//        logger.info("Perimeter of the square is ="+ square1.getPerimeter() +"\n");
//        Triangle triangle = new Triangle(10,10,10);
//        logger.info("Area of the triangle is ="+ triangle.getArea()+"\n");
//        Triangle triangle1 = new Triangle(2,2,2);
//        logger.info("Perimeter of the " + triangle1.getClass().getSimpleName() + " is ="+ triangle1.getPerimeter()+"\n");
//        Circle circle = new Circle(50);
//        logger.info("Area of the circle is ="+ circle.getArea()+"\n");
//        Circle circle1 = new Circle(50);
//        logger.info("Perimeter of the circle is ="+ circle1.getPerimeter()+"\n");
//
//        triangles.stream().sorted((e1, e2) -> {
//            return -1;
//        }).collect(Collectors.toList());


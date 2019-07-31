import AbstractShape.Circle.Circle;
import AbstractShape.Square.Square;
import AbstractShape.Triangle.Triangle;

import java.util.*;
import java.util.Collections;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Main {
    private static ArrayList<Circle> circles = new ArrayList<>();
    private static ArrayList<Triangle> triangles = new ArrayList<>();
    private static ArrayList<Square> squares = new ArrayList<>();
    private static final Logger logger = Logger.getLogger("aerQ");
    public static void main(String[] args) {
//        int sum = 0;
//
//        for(String singleChar : ololo.split("")) {
//            int parsed = Integer.parseInt(singleChar);
//            sum += parsed;
//        }
//        System.out.println(sum);
//    }
//        Ввести с консоли n целых чисел и поместить их в массив.
        System.out.print("Сколько целых чисел вы собираетесь ввести? ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        if (size == 0) {
            System.out.print("Программа завершена.");
            System.exit(0);
        }
        Integer[] numbers = new Integer[size];
        System.out.print("Введите целые числа через пробел "
                + "и нажмите <Enter>: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = in.nextInt();
        }


        findPalindromicNumbers(numbers);

        String number = "123456";
        int sum = 0;
        for (String charr : number.split("")) {
                int parsed = Integer.parseInt(charr);
                sum = sum + parsed;
        }
        System.out.println(sum);

        int numberr = 34537;
        int sums = 0;
        while (numberr > 0) {
            int lastDigit = numberr % 10;
            sums += lastDigit;
            numberr /= 10;
        }
        System.out.println("Sum of digits : "+sums);



        circles.add(new Circle(15));
        circles.add(new Circle(25));
        circles.add(new Circle(35));
        circles.add(new Circle(45));
        circles.add(new Circle(55));
        circles.add(new Circle(65));
        //        ----------------------------------------------
        triangles.add(new Triangle(10,10,10));
        triangles.add(new Triangle(20,13,14));
        triangles.add(new Triangle(16,21,6));
        triangles.add(new Triangle(15,18,23));
        triangles.add(new Triangle(18,20,12));
        triangles.add(new Triangle(42,69,32));
        //        ----------------------------------------------
        squares.add(new Square(25,2));
        squares.add(new Square(13,6));
        squares.add(new Square(55,37));
        squares.add(new Square(7,17));
        squares.add(new Square(15,22));
        squares.add(new Square(95,32));

        Collections.sort(circles);
        Collections.sort(triangles);
        Collections.sort(squares);

        AbstractShape.Square.Square square = new AbstractShape.Square.Square(10,10);
        logger.info("Area of the square is ="+ square.getArea() +"\n");
        AbstractShape.Square.Square square1 = new AbstractShape.Square.Square(10,10);
        logger.info("Perimeter of the square is ="+ square1.getPerimeter() +"\n");
        Triangle triangle = new Triangle(10,10,10);
        logger.info("Area of the triangle is ="+ triangle.getArea()+"\n");
        Triangle triangle1 = new Triangle(2,2,2);
        logger.info("Perimeter of the " + triangle1.getClass().getSimpleName() + " is ="+ triangle1.getPerimeter()+"\n");
        Circle circle = new Circle(50);
        logger.info("Area of the circle is ="+ circle.getArea()+"\n");
        Circle circle1 = new Circle(50);
        logger.info("Perimeter of the circle is ="+ circle1.getPerimeter()+"\n");

        logger.info("Максимальная и минимальная площадь квадрата:"+"\n" + squares.get(0).getArea()+"\n" + squares.get(squares.size() -1 ).getArea() +"\n");
        logger.info("Максимальная и минимальная площадь квадрата:"+"\n" + circles.get(0).getArea()+"\n" + circles.get(circles.size() -1 ).getArea() +"\n");
        logger.info("Максимальная и минимальная площадь квадрата:"+"\n" + triangles.get(0).getArea()+"\n" + triangles.get(triangles.size() -1 ).getArea());


    }
    private static void findPalindromicNumbers(Integer[] numbers) {
        List<StringBuilder> result = new ArrayList<StringBuilder>();
        for (Integer sourceNumber : numbers) {
            StringBuilder s = new StringBuilder(sourceNumber.toString());
            if (s.toString().equals(s.reverse().toString())) {
                result.add(s);
            }
        }
        System.out.println("Числа-палиндромы: " + result);
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
//    }


//        triangles.stream().sorted((e1, e2) -> {
//            return -1;
//        }).collect(Collectors.toList());


import AbstractShape.Circle.Circle;
import AbstractShape.Square.Square;
import AbstractShape.Triangle.Triangle;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.*;
import java.util.Collections;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Main {
    private static ArrayList<Circle> circles = new ArrayList<>();
    private static ArrayList<Triangle> triangles = new ArrayList<>();
    private static ArrayList<Square> squares = new ArrayList<>();
    private static final Logger logger = Logger.getLogger("aerQ");
    private static List<SaveInfo> saveInfos = new ArrayList<>();

    public static void main(String[] args) throws TooOldException,TooYoungException  {
       FileWriter fw = null;
        saveInfos.add(new SaveInfo());
        saveInfos.add(new SaveInfo());
        saveInfos.add(new SaveInfo());
        saveInfos.add(new SaveInfo());
        saveInfos.add(new SaveInfo());
        saveInfos.add(new SaveInfo());
        saveInfos.add(new SaveInfo());
        saveInfos.add(new SaveInfo());
        saveInfos.add(new SaveInfo());
        saveInfos.add(new SaveInfo());

        try {
            fw = new FileWriter("C:/Users/Остап/IdeaProjects/learning/src/main/log.txt", true);
            for (SaveInfo saveInfo : saveInfos) {
                fw.write(saveInfo.getTime() + " / " + SaveInfo.getSessionRandomValue(1, 999999999) + " / " + saveInfo.getRandomIP()+"\n");
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }





//        int sum = 0;
//        for(String singleChar : ololo.split("")) {
//            int parsed = Integer.parseInt(singleChar);
//            sum += parsed;
//        }
//        System.out.println(sum);
//    }
//        Scanner scan = new Scanner(System.in);
//        int num1 = scan.nextInt();
//        int num2 = scan.nextInt();
//        int result = num1*num2;
//        System.out.print("--------");
//        System.out.print("\n" + result);
//        System.out.println(" ");
//
//        int x = scan.nextInt();
//        int c = scan.nextInt();
//        int result1 = x*c;
//        System.out.println("--------");
//        System.out.print( result1);


        int value = 10 / 2;
        System.out.println("Two");
        System.out.println("One");
        try{
            value = 10/0;
            System.out.println("value:" + value);
        }catch (ArithmeticException e){
            System.out.println("ERROR:" + e.getMessage());
        }
        System.out.println("???????");

        String number = "1234567";
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

        logger.info("Min and max value in the Square Collection:"+"\n" + squares.get(0).getArea()+"\n" + squares.get(squares.size() -1 ).getArea() +"\n");
        logger.info("Min and max value in the Circle Collection:"+"\n" + circles.get(0).getArea()+"\n" + circles.get(circles.size() -1 ).getArea() +"\n");
        logger.info("Min and max value in the Triangle Collection:"+"\n" + triangles.get(0).getArea()+"\n" + triangles.get(triangles.size() -1 ).getArea());

        int age = 39;
        checkAge(age);
    }
        public static void checkAge(int age) throws TooYoungException, TooOldException{
        if (age < 18){
            throw new TooYoungException("Age" + age + "too young");
        }else if (age>40){
            throw new TooOldException("Age" + age + "too old");
        }
            System.out.println("Age " + age + " It`s OK!");
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


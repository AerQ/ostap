package AbstractShape.Square;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.*;

public class SquareTest {

     @BeforeClass
     public static void init() {
         System.out.println("BEFORECLASS");
     }

     @Before
     public void initTestMethod() {
         System.out.println("BEFORE");
    }

    @Test
    public void getAreaReturnsValidResultGivenValidInput() {
        Square square = new Square(10,10);
        double act = square.getArea();
        int expect = 100;
        assertEquals(expect, act, 0.001);
    }

    @Test
    public void getAreaIfNegativeSign(){
         Square square = new Square(2,-3);
        double act = square.getArea();
        int expect = -6;
        assertEquals(expect, act, 0.001);
    }


    @Test
    public void getPerimeterReturnsValidResultGivenValidInput() {

         Square square= new Square(20, 20);
         double act = square.getPerimeter();
         double expect = 80;
        assertEquals(expect, act, 0.001);


    }
}
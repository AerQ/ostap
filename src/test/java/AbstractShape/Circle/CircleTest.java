package AbstractShape.Circle;


import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @BeforeClass
    public static void init(){
        System.out.println("BEFORECLASS_init");
    }
    @Before
    public void initTest(){
        System.out.println("BEFORE_init");
    }


    @Test
    public void getArea() {
        Circle circle = new Circle(50);
        double actual = circle.getArea();
        double expected = 7853.9816;
        assertEquals(actual, expected, 0.0001);
    }
    @Test
    public void getAreaIfNegativeSign(){
        Circle circle = new Circle(-3);
        double act = circle.getArea();
        double expect = 28.2743;
        assertEquals(expect, act, 0.001);
    }
    @Test
    public void getPerimeter() {
        Circle circle = new Circle(50);
        double actual = circle.getPerimeter();
        double expected = 314.1592;
        assertEquals(actual, expected,0.0001);
    }
}
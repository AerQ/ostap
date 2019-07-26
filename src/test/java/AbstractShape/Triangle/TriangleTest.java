package AbstractShape.Triangle;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

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
        Triangle triangle = new Triangle(10,10,10);
        double actual = triangle.getArea();
        double expected = 43.3012;
        assertEquals(actual, expected, 0.0001);
    }
    @Test
    public void getAreaIfNegativeSign() {
        Triangle triangle = new Triangle(-10,-10,-10);
        double actual = triangle.getArea();
        double expected = 43.3012;
        assertEquals(actual, expected, 0.0001);
    }
    @Test
    public void getPerimeter() {
        Triangle triangle = new Triangle(50,50,50);
        double actual = triangle.getPerimeter();
        double expected = 150;
        assertEquals(actual, expected,0.0001);
    }
}

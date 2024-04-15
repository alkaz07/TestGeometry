import alkaz.Point;
import alkaz.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TrinagleTest {
    static Point zero;
    @BeforeAll
    public static void initZero(){
        zero = new Point(0, 0);
    }
    static Point a, b, c;

    @BeforeAll
    public static void initABC(){
        a = new Point(123, 100);
        b = new Point(100, 150);
        c = new Point(123, 150);
    }

    @Test
    public void testPerim(){
        Triangle tr = new Triangle(new Point(0, 0), new Point(3, 4), new Point(0, 4));
        Assertions.assertEquals(12, tr.perimeter());

        Triangle tr2 = new Triangle(zero, zero, zero);
        Assertions.assertEquals(0, tr2.perimeter());

        Assertions.assertEquals(new Triangle(a, b, c).perimeter(), new Triangle(b, c, a).perimeter());
    }

    @Test
    public void testArea(){
        Triangle tr = new Triangle(new Point(0, 0), new Point(3, 4), new Point(0, 4));
        Assertions.assertEquals(6, tr.area());
    }
   //@Test
    //public void testEqualsTriangle(){
    //    Triangle triangle = new Triangle(new Point(0, 0), new Point(3, 4), new Point())
    //}
}

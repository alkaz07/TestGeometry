import alkaz.Circle;
import alkaz.Point;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class eqCircleTest {


    @Test
    public void testIntersection() {
        Circle c1 = new Circle(10, new Point(0, 0));
        Circle c2 = new Circle(10, new Point(100, 0));
        Circle c3 = new Circle(10, new Point(6, 0));
        Circle c4 = new Circle(10, new Point(0, 10));
        Circle c5 = new Circle(5, new Point(1, 1));
        Circle c6 = new Circle(5, new Point(7, 7));
        Assertions.assertEquals(false, c1.eqCircle(c5));
        Assertions.assertEquals(false, c2.eqCircle(c6));
        Assertions.assertEquals(true, c1.eqCircle(c2));
        Assertions.assertEquals(true, c2.eqCircle(c3));
        Assertions.assertEquals(true, c3.eqCircle(c4));
        Assertions.assertEquals(false, c6.eqCircle(c2));

    }
}

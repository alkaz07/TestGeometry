import alkaz.Point;
import alkaz.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class EqTriangTest {



    @Test
    public void eqTriang1(){

        Triangle tr = new Triangle(new Point(0, 0), new Point(3, 4), new Point(0, 4));
        Triangle tr2 = new Triangle(new Point(1, 1), new Point(4, 5), new Point(1, 5));

        Assertions.assertTrue(tr.eqTriang(tr2));
        Triangle tr3 = new Triangle(new Point(0, 0), new Point(3, 4), new Point(0, 4));
        Triangle tr4 = new Triangle(new Point(0, 0), new Point(-3, 4), new Point(0, 4));

        Assertions.assertTrue(tr3.eqTriang(tr4));

    }

}

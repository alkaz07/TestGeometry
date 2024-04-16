import alkaz.Point;
import alkaz.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static alkaz.WorkWithTriangles.*;

public class WorkTest {
    @Test
    public void testMakeTrFromStr(){
        String s= "0 0 3 4 0 4";
        Triangle tr = new Triangle(new Point(0, 0), new Point(3, 4), new Point(0, 4));
        Triangle testTr = makeTrFromStr(s);
        Assertions.assertTrue(tr.eqTriang(testTr));
        Assertions.assertEquals(tr, testTr);
        String s2 = "0 0 0 4 3 4";
        Triangle testTr2 = makeTrFromStr(s2);
        Assertions.assertNotEquals(testTr, testTr2);
    }

    @Test
    public void testReadTriangles(){
        String s = "tr1.txt";
        ArrayList<Triangle> list = new ArrayList<>();
        Triangle tr = new Triangle(new Point(0, 0), new Point(3, 4), new Point(0, 4));
        list.add(tr);

        ArrayList<Triangle> fact = readTriangles(s);
        Assertions.assertIterableEquals(list, fact);

        list.clear();
        list.add(makeTrFromStr("0 0 0 2 2 0"));
        list.add(makeTrFromStr("5 6 123 100 123 6"));
        list.add(makeTrFromStr("12 13 14 0 12 14"));

        fact = readTriangles("tr2.txt");
        Assertions.assertIterableEquals(list, fact);
    }

    @Test
    public void testAverageArea(){
        ArrayList<Triangle> triangles = new ArrayList<>();
        triangles.add(makeTrFromStr("0 0 0 4 3 0"));
        Assertions.assertEquals(6, averageArea(triangles));
        triangles.add(makeTrFromStr("0 0 0 4 3 0"));
        Assertions.assertEquals(6, averageArea(triangles));
        triangles.clear();
        triangles.add(makeTrFromStr("0 0 0 8 6 0"));
        Assertions.assertEquals(24, averageArea(triangles));
        triangles.add(makeTrFromStr("0 0 0 4 3 0"));
        Assertions.assertEquals(15, averageArea(triangles));
    }
}

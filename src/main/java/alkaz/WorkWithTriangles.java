package alkaz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WorkWithTriangles {
    public static ArrayList<Triangle> readTriangles(String file) {
        try {
            Scanner scanner = new Scanner(new File(file));
            ArrayList<Triangle> triangles = new ArrayList<>();
            while(scanner.hasNext()) {
                String s = scanner.nextLine();
                Triangle t = makeTrFromStr(s);
                triangles.add(t);
            }
            return triangles;
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
            return null;
        }
    }

    public static Triangle makeTrFromStr(String s) {
        Scanner scanner = new Scanner(s);
        double x, y;
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        Point v1 = new Point(x, y);
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        Point v2 = new Point(x, y);
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        Point v3 = new Point(x, y);
        return new Triangle(v1, v2, v3);
    }

    public static double averageArea(ArrayList<Triangle> triangles) {
        double sumS = 0;
        for (Triangle t : triangles) {
            sumS += t.area();
        }
        return sumS/ triangles.size();
    }
}

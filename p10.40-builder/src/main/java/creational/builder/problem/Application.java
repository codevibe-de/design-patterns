package creational.builder.problem;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {
        final Point p = new Point(1, 2);

        final Rectangle r = new Rectangle(10, 20, 100, 200);

        final List<Point> points = new ArrayList<>();
        points.add(new Point(1, 2));
        points.add(new Point(3, 4));
        points.add(new Point(5, 6));
        final Polygon poly = new Polygon(points);

        System.out.println(p);
        System.out.println(r);
        System.out.println(poly);
    }
}

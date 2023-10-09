package creational.builder.solution;

public class Application {

    public static void main(String[] args) throws Exception {
        final Point p = new Point(1, 2);
        final Rectangle r = new Rectangle(10, 20, 100, 200);

        final Polygon poly = new Polygon.Builder()
                .add(1, 2)
                .add(3, 4)
                .add(5, 6)
                .build();
        final Polygon poly2 = new Polygon.Builder()
                .add(1, 2)
                .add(3, 4)
                .add(5, 6)
                .build();

        System.out.println(p);
        System.out.println(r);
        System.out.println(poly);
    }
}

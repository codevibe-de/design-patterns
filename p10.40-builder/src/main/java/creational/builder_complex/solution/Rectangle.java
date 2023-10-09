package creational.builder_complex.solution;

public class Rectangle extends Shape {

    private final Point p1;
    private final Point p2;

    Rectangle(int x, int y, int width, int height) {
        this(
                new Point(x, y),
                new Point(x + width, y + height)
        );
    }

    Rectangle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point p1() {
        return this.p1;
    }

    public Point p2() {
        return this.p2;
    }

    @Override
    public String toString() {
        return "Rectangle [p1=" + this.p1 + ", p2=" + this.p2 + "]";
    }

}

package creational.builder.problem;

public class Rectangle extends Shape {

    private final Point p1;
    private final Point p2;

    public Rectangle(int x, int y, int width, int height) {
        this.p1 = new Point(x, y);
        this.p2 = new Point(x + width, y + height);
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

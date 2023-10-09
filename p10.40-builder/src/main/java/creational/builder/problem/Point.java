package creational.builder.problem;

public class Point extends Shape {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int x() {
        return this.x;
    }

    public int y() {
        return this.y;
    }

    @Override
    public String toString() {
        return "Point [x=" + this.x + ", y=" + this.y + "]";
    }
}

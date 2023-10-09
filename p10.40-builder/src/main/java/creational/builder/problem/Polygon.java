package creational.builder.problem;

import java.util.ArrayList;
import java.util.List;

public class Polygon extends Shape {

    private final List<Point> points = new ArrayList<>();

    public Polygon(List<Point> points) {
        this.points.addAll(points);
    }

    public int size() {
        return this.points.size();
    }

    public Point get(int index) {
        return this.points.get(index);
    }

    @Override
    public String toString() {
        return "Polygon [points=" + this.points + "]";
    }

}

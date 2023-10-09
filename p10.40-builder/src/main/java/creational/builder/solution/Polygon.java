package creational.builder.solution;

import java.util.ArrayList;
import java.util.List;

public class Polygon extends Shape {

    private final List<Point> points;

    private Polygon(List<Point> points) {
        this.points = points;
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

    //
    // BUILDER pattern
    //

    public static class Builder {

        private List<Point> points = new ArrayList<>();

        // intermediate build step -- collect data
        public Builder add(int x, int y) {
            this.points.add(new Point(x, y));
            return this;
        }

        // terminal build step -- construct a Polygon instance from all data that was collected
        public Polygon build() {
            final Polygon polygon = new Polygon(this.points);
            this.points.clear();
            return polygon;
        }
    }

}

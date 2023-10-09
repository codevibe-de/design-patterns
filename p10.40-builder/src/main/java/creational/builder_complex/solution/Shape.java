package creational.builder_complex.solution;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape {

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

        // terminal build step -- construct a Shape instance from all data that was collected
        public Shape build() {
            if (points.size() == 1) {
                return points.get(0);
            } else if (points.size() == 2) {
                return new Rectangle(points.get(0), points.get(1));
            } else {
                return new Polygon(points);
            }
        }
    }
}

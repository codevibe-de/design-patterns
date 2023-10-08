package structural.flyweight.problem;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forrest {

    private final List<Tree> trees = new ArrayList<>();

    public void addTree(Tree t) {
        trees.add(t);
    }

    public void draw() {
        trees.forEach(t -> {
            setColor(t.color);
            drawShape(t.x, t.y, t.shape);
        });
    }

    private void setColor(Color color) {
        // ...
    }

    private void drawShape(int x, int y, Polygon shape) {
        // ...
    }
}

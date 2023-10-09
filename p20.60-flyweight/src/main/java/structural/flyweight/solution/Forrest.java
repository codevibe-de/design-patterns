package structural.flyweight.solution;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forrest {

    private List<Tree> trees = new ArrayList<>();

    private TreeTypeFactory treeTypeFactory = new TreeTypeFactory();

    public void addTree(int x, int y, Color color, Polygon shape) {
        trees.add(
                new Tree(
                        x, y,                                       // external data
                        treeTypeFactory.getTreeType(color, shape)   // internal data
                )
        );
    }

    public void draw() {
        trees.forEach(t -> {
            setColor(t.treeType().color());
            drawShape(t.x(), t.y(), t.treeType().shape());
        });
    }

    private void setColor(Color color) {
        // ...
    }

    private void drawShape(int x, int y, Polygon shape) {
        // ...
    }
}

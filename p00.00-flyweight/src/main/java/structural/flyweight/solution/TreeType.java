package structural.flyweight.solution;

import java.awt.*;

public class TreeType {
    public Color color;
    public Polygon shape;

    public TreeType(Color color, Polygon shape) {
        this.color = color;
        this.shape = shape;
    }
}

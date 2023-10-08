package structural.flyweight.problem;

import java.awt.*;

public class Tree {

    public int x;
    public int y;
    public Color color;     // small memory footprint, but very limited spread of values
    public Polygon shape;   // very large data structure

}

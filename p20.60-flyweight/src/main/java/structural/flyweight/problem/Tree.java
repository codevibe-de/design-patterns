package structural.flyweight.problem;

import java.awt.*;

public record Tree(
        int x,
        int y,
        Color color,     // small memory footprint, but very limited spread of values
        Polygon shape   // very large data structure
) {
}
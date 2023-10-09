package structural.flyweight.solution;

import org.apache.commons.lang3.tuple.Pair;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TreeTypeFactory {

    private Map<Pair<Color, Shape>, TreeType> treeTypes = new ConcurrentHashMap<>();

    public TreeType getTreeType(Color color, Polygon shape) {
        Pair<Color, Shape> key = Pair.of(color, shape);
        TreeType treeType = treeTypes.get(key);
        if (treeType == null) {
            treeType = new TreeType(color, shape);
            treeTypes.put(key, treeType);
        }
        return treeType;
    }
}

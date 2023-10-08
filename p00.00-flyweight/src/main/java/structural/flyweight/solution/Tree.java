package structural.flyweight.solution;

public class Tree {

    public int x;
    public int y;
    public TreeType treeType;

    public Tree(int x, int y, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }
}

package startegy.solution;

@FunctionalInterface
public interface ReallocStrategy {

    int newSize(int oldSize);

}

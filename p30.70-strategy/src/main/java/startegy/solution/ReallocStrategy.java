package startegy.solution;

@FunctionalInterface
public interface ReallocStrategy {
    public abstract int newSize(int oldSize);
}

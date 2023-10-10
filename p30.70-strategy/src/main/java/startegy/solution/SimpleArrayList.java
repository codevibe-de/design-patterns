package startegy.solution;

public class SimpleArrayList<T> {

    private T[] elements;
    private int size;
    private final ReallocStrategy strategy;

    private static final ReallocStrategy defaultStrategy = new ReallocStrategy() {
        @Override
        public int newSize(int oldSize) {
            return oldSize * 2;
        }
    };

    public SimpleArrayList(int size, ReallocStrategy strategy) {
        this.elements = this.createArray(size);
        this.strategy = strategy;
    }

    public SimpleArrayList() {
        this(2, defaultStrategy);
    }

    public void add(T element) {
        this.ensureCapacity();
        this.elements[this.size] = element;
        this.size++;
    }

    public int size() {
        return this.size;
    }

    public T get(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        return this.elements[index];
    }

    private void ensureCapacity() {
        if (this.size == this.elements.length) {
            final T[] newElements = this.createArray(this.strategy.newSize(this.size));
            for (int i = 0; i < this.size; i++) {
                newElements[i] = this.elements[i];
            }
            this.elements = newElements;
        }
    }

    @SuppressWarnings("unchecked")
    private T[] createArray(int length) {
        return (T[]) new Object[length];
    }
}

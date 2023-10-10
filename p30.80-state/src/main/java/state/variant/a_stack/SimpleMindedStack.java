package state.variant.a_stack;

public class SimpleMindedStack<T> {

    private final T[] elements;
    private int count;

    @SuppressWarnings("unchecked")
    public SimpleMindedStack(int size) {
        if (size < 2) {
            throw new IllegalArgumentException("size must be >= 2");
        }
        this.elements = (T[]) new Object[size];
    }

    public void push(T element) {
        if (this.isFull()) {
            throw new IllegalStateException("stack is full");
        }
        this.elements[this.count] = element;
        this.count++;
    }

    public T pop() {
        if (this.isEmpty()) {
            throw new IllegalStateException("stack is empty");
        }
        this.count--;
        return this.elements[this.count];
    }

    public T top() {
        if (this.isEmpty()) {
            throw new IllegalStateException("stack is empty");
        }
        return this.elements[this.count - 1];
    }

    public boolean isEmpty() {
        return this.count == 0;
    }

    public boolean isFull() {
        return this.count == this.elements.length;
    }

    public boolean isFilled() {
        return !this.isFull() && !this.isEmpty();
    }
}

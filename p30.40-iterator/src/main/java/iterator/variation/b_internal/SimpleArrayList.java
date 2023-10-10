package iterator.variation.b_internal;

import java.util.function.Consumer;

public class SimpleArrayList<T> {

    private T[] elements = this.createArray(2);
    private int size;

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
            final T[] newElements = this.createArray(2 * this.size);
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

    public void forEach(Consumer<T> consumer) {
        for (int i = 0; i < this.size; i++) {
            consumer.accept(this.elements[i]);
        }
    }
}

package iterator.solution;

import java.util.Iterator;

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

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return this.currentIndex < SimpleArrayList.this.size;
            }

            @Override
            public T next() {
                final T element = SimpleArrayList.this.elements[this.currentIndex];
                this.currentIndex++;
                return element;
            }
        };
    }
}

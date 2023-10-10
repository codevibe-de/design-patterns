package iterator.variation.a_iterable;

import java.util.Iterator;

public class SimpleLinkedList<T> implements Iterable<T> {

    public static class Node<T> {
        private final T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
        }

        public T getValue() {
            return this.value;
        }

        public Node<T> getNext() {
            return this.next;
        }
    }

    private Node<T> first;
    private Node<T> last;

    public void add(T element) {
        final Node<T> node = new Node<T>(element);
        if (this.first == null) {
            this.first = node;
        } else {
            this.last.next = node;
        }
        this.last = node;
    }

    public Node<T> getFirst() {
        return this.first;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node<T> currentNode = SimpleLinkedList.this.first;

            @Override
            public boolean hasNext() {
                return this.currentNode != null;
            }

            @Override
            public T next() {
                final T element = this.currentNode.value;
                this.currentNode = this.currentNode.next;
                return element;
            }
        };
    }
}

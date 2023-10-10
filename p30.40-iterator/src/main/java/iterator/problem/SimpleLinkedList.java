package iterator.problem;

public class SimpleLinkedList<T> {

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
}

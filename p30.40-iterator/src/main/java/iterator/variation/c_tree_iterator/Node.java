package iterator.variation.c_tree_iterator;

import java.util.function.Consumer;


public class Node<T extends Comparable<T>> {

    private Node<T> left;
    private Node<T> right;
    private final T value;

    public Node(T value) {
        this.value = value;
    }

    public Node<T> getLeft() {
        return this.left;
    }

    public Node<T> getRight() {
        return this.right;
    }

    public void add(T value) {
        if (this.value.compareTo(value) > 0) {
            if (this.left == null) {
                this.left = new Node<T>(value);
            } else {
                this.left.add(value);
            }
        } else {
            if (this.right == null) {
                this.right = new Node<T>(value);
            } else {
                this.right.add(value);
            }
        }
    }

    public void foreach(Consumer<T> consumer) {
        if (this.left != null) {
            this.left.foreach(consumer);
        }
        consumer.accept(this.value);
        if (this.right != null) {
            this.right.foreach(consumer);
        }
    }
}

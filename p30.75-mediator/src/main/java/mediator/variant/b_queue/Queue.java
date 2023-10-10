package mediator.variant.b_queue;

import java.util.LinkedList;

public class Queue<T> {

    private final LinkedList<T> list = new LinkedList<>();

    private final int max = 3;

    public void enqueue(T product) {
        this.log(">> enqueue");
        synchronized (this) {
            while (this.list.size() == this.max) {
                this.log("WAITING...");
                try {
                    this.wait();
                } catch (final InterruptedException ignored) {
                }
            }
            assert this.list.size() < this.max;
            this.list.add(product);
            this.notifyAll();
        }
        this.log("<< enqueue " + product);
    }

    public T dequeue() {
        this.log("\t\t>> dequeue");
        T product = null;
        synchronized (this) {
            while (this.list.size() == 0) {
                this.log("\t\tWAITING...");
                try {
                    this.wait();
                } catch (final InterruptedException ignored) {
                }
            }
            assert this.list.size() > 0;
            product = this.list.removeFirst();
            this.notifyAll();
        }
        this.log("\t\t<< dequeue " + product);
        return product;
    }

    private void log(String text) {
        System.out.println(text + " [" + Thread.currentThread().getId() + "]");
    }
}

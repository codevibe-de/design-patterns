package mediator.variant.b_queue;

public class Consumer extends Thread {

    private final Queue<String> queue;

    public Consumer(Queue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        final int sleeptime = 1000;
        while (true) {
            final String product = this.queue.dequeue();
            if (product.length() == 0) {
                break;
            }
            Util.sleep(sleeptime);
        }
    }
}

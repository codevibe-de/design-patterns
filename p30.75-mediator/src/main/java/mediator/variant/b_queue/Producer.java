package mediator.variant.b_queue;

public class Producer extends Thread {

    private final Queue<String> queue;

    public Producer(Queue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            final int sleeptime = (int) (Math.random() * 1000);
            Util.sleep(sleeptime);
            this.queue.enqueue("\"" + i + "\"");
        }
    }
}

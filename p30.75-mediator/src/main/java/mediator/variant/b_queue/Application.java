package mediator.variant.b_queue;

public class Application {

    public static void main(String[] args) {
        final Queue<String> queue = new Queue<>();

        final Consumer consumer1 = new Consumer(queue);
        final Consumer consumer2 = new Consumer(queue);
        final Producer producer = new Producer(queue);

        consumer1.start();
        Util.sleep(1000);
        consumer2.start();
        Util.sleep(1000);
        producer.start();

        try {
            producer.join();
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }

        queue.enqueue("");
        queue.enqueue("");
    }
}

package mediator.variant.b_queue;

public class Util {
    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (final InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

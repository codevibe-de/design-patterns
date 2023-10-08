package creational.factory_method;

import java.util.Random;

public abstract class PostalDelivery {

    void send(String contents) {
        int weight = calculateWeight();
        Container container = createContainer(contents, weight);
        billing(container);
        delivery(container);
    }

    abstract protected Container createContainer(String contents, int weight);

    private int calculateWeight() {
        return new Random().nextInt(1, 10);
    }

    private void billing(Container container) {
        // complicated business logic
    }

    private void delivery(Container container) {
        // complicated business logic
    }

}

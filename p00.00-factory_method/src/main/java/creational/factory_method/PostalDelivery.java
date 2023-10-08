package creational.factory_method;

import java.util.List;

public abstract class PostalDelivery {

    void send(List<String> contents) {
        int weight = calculateWeight(contents);
        Container container = createContainer(contents, weight);
        billing(container);
        delivery(container);
    }

    abstract protected Container createContainer(List<String> contents, int weight);

    private int calculateWeight(List<String> contents) {
        return contents.size();
    }

    private void billing(Container container) {
        // complicated business logic
    }

    private void delivery(Container container) {
        // complicated business logic
    }

}

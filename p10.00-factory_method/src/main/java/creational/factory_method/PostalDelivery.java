package creational.factory_method;

import java.util.List;

// This is the abstract creator, which contains business logic.
public abstract class PostalDelivery {

    public void send(List<String> contents) {
        int weight = calculateWeight(contents);
        Container container = createContainer(contents, weight);
        billing(container);
        delivery(container);
    }

    // this is the FACTORY METHOD that gives name to this pattern
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

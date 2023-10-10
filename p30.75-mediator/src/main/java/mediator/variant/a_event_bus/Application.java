package mediator.variant.a_event_bus;

public class Application {

    public static void main(String[] args) {
        final EventBus bus = new EventBus();

        new SubscriberX(bus);
        new SubscriberY(bus);
        new SubscriberZ(bus);

        final PublisherV v = new PublisherV(bus);
        final PublisherW w = new PublisherW(bus);

        v.pushlish();
        w.pushlish();

    }
}

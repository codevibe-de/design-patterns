package mediator.variant.a_event_bus;

public class PublisherV {
    private final EventBus eventBus;

    public PublisherV(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    public void pushlish() {
        this.eventBus.send(new EventA(42));
        this.eventBus.send(new EventB("Hello"));
    }
}

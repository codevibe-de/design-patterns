package mediator.variant.a_event_bus;

public class PublisherW {
    private final EventBus eventBus;

    public PublisherW(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    public void publish() {
        this.eventBus.send(new EventC(2.71));
    }
}

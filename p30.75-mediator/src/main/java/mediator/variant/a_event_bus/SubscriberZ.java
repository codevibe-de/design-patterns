package mediator.variant.a_event_bus;

public class SubscriberZ {
    public SubscriberZ(EventBus eventBus) {
        eventBus.register(Object.class,
                e -> System.out.println("\t\t" + this.getClass().getName() + " <- " + e));
    }
}
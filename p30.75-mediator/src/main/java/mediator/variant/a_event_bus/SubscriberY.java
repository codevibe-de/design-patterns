package mediator.variant.a_event_bus;

public class SubscriberY {
    public SubscriberY(EventBus eventBus) {

        eventBus.register(EventB.class,
                e -> System.out.println("\t\t" + this.getClass().getName() + " <- " + e.b));

        eventBus.register(EventC.class,
                e -> System.out.println("\t\t" + this.getClass().getName() + " <- " + e.c));
    }
}
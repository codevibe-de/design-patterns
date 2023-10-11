package mediator.variant.a_event_bus;

import java.util.function.Consumer;

public class SubscriberX {

    public SubscriberX(EventBus eventBus) {

        eventBus.register(
                EventA.class,
                System.out::println
        );

        eventBus.register(EventA.class, new Consumer<EventA>() {
            @Override
            public void accept(EventA e) {
                System.out.println("\t\t" + this.getClass().getName() + " <- " + e.a);
            }
        });

        eventBus.register(EventB.class, new Consumer<EventB>() {
            @Override
            public void accept(EventB e) {
                System.out.println("\t\t" + this.getClass().getName() + " <- " + e.b);
            }
        });
    }
}

package mediator.variant.a_event_bus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;


public class EventBus {

    private final Map<Class<?>, List<Consumer<?>>> map = new HashMap<>();

    public synchronized <T> void register(Class<T> type, Consumer<T> consumer) {
        List<Consumer<?>> consumers = this.map.get(type);
        if (consumers == null) {
            consumers = new ArrayList<Consumer<?>>();
            this.map.put(type, consumers);
        }
        consumers.add(consumer);
    }

    @SuppressWarnings("unchecked")
    public void send(Object event) {
        System.out.println("> " + event);
        for (Class<?> eventClass = event.getClass(); eventClass != null; eventClass = eventClass.getSuperclass()) {
            final List<Consumer<?>> consumers = this.map.get(eventClass);
            if (consumers != null) {
                for (final Consumer<?> consumer : consumers) {
                    ((Consumer<Object>) consumer).accept(event);
                }
            }
        }
    }
}

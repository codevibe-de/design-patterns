package mediator.variant.a_event_bus;


public class EventB {
    public final String b;

    public EventB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [" + this.b + "]";
    }
}

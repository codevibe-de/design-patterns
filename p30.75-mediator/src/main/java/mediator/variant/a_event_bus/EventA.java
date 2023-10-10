package mediator.variant.a_event_bus;


public class EventA {
    public final int a;

    public EventA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [" + this.a + "]";
    }
}

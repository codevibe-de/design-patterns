package mediator.variant.a_event_bus;


public class EventC {
    public final double c;

    public EventC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [" + this.c + "]";
    }
}

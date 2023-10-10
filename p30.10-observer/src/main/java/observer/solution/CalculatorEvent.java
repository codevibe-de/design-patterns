package observer.solution;

public class CalculatorEvent {

    public enum Type {
        ADD, SUBTRACT
    }

    private final Calculator source;
    private final Type type;
    private final int value;

    public CalculatorEvent(Calculator source, Type type, int value) {
        this.source = source;
        this.type = type;
        this.value = value;
    }

    public Calculator getSource() {
        return this.source;
    }

    public Type getType() {
        return this.type;
    }

    public int getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return this.type + " " + this.value;
    }
}

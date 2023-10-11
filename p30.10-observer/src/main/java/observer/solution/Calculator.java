package observer.solution;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    //
    // OBSERVER pattern
    //

    private final List<CalculatorObserver> observers = new ArrayList<>();   // registry

    public void addCalculatorObserver(CalculatorObserver observer) {
        this.observers.add(observer);
    }

    public void removeCalculatorObserver(CalculatorObserver observer) {
        this.observers.remove(observer);
    }

    private void dispatchCalculatorEvent(CalculatorEvent.Type type, int v) {
        final CalculatorEvent e = new CalculatorEvent(this, type, v);
        this.observers.forEach(observer -> observer.valueChanged(e));
    }

    //
    // calculator business logic
    //

    private int value;

    public void add(int v) {
        this.value += v;
        this.dispatchCalculatorEvent(CalculatorEvent.Type.ADD, v);
    }

    public void subtract(int v) {
        this.value -= v;
        this.dispatchCalculatorEvent(CalculatorEvent.Type.SUBTRACT, v);
    }

    public int getValue() {
        return this.value;
    }

}

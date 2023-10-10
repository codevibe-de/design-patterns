package observer.problem;

public class Calculator {

    private int value;

    public void add(int v) {
        this.value += v;
    }

    public void subtract(int v) {
        this.value -= v;
    }

    public int getValue() {
        return this.value;
    }

}

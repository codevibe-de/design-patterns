package composite.variation.expressions;

public class Constant implements Expression {

    private final double value;

    public Constant(double value) {
        this.value = value;
    }

    @Override
    public double evaluate() {
        return this.value;
    }

    @Override
    public int getChildCount() {
        return 0;
    }

    @Override
    public Expression getChild(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }

}

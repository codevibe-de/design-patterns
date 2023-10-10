package composite.variation.expressions;

public class SquareExpression extends ComplexExpression {

    public SquareExpression(Expression e) {
        super("square", e);
    }

    @Override
    public double evaluate() {
        final double value = this.getChild(0).evaluate();
        return value * value;
    }
}

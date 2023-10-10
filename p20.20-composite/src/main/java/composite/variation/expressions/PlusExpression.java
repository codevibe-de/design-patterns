package composite.variation.expressions;

public class PlusExpression extends ComplexExpression {

    public PlusExpression(Expression e0, Expression e1) {
        super("plus", e0, e1);
    }

    @Override
    public double evaluate() {
        return this.getChild(0).evaluate() + this.getChild(1).evaluate();
    }

}

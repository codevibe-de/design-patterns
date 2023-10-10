package composite.variation.expressions;

public class MinusExpression extends ComplexExpression {

    public MinusExpression(Expression e0, Expression e1) {
        super("minus", e0, e1);
    }

    @Override
    public double evaluate() {
        return this.getChild(0).evaluate() - this.getChild(1).evaluate();
    }

}

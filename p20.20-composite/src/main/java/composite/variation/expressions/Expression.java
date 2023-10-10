package composite.variation.expressions;

public interface Expression {

    double evaluate();

    int getChildCount();

    Expression getChild(int index);

}

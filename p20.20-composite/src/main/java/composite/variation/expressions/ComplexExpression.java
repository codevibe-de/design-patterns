package composite.variation.expressions;

import java.util.Arrays;

public abstract class ComplexExpression implements Expression {

    private final String name;
    private final Expression[] children;

    public ComplexExpression(String name, Expression... children) {
        this.name = name;
        this.children = children;
    }

    @Override
    public int getChildCount() {
        return this.children.length;
    }

    @Override
    public Expression getChild(int index) {
        return this.children[index];
    }

    @Override
    public String toString() {
        return this.name + Arrays.toString(this.children);
    }

}

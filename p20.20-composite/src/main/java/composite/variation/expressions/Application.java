package composite.variation.expressions;


public class Application {

    // (5 - 2) + (10 ^ 2)
    public static void main(String[] args) {
        final Expression sqr = new SquareExpression(new Constant(10));
        final Expression minus = new MinusExpression(new Constant(5), new Constant(2));
        final Expression plus = new PlusExpression(minus, sqr);
        System.out.println(plus.evaluate());
        print(plus, "");
    }

    static void print(Expression expression, String indent) {
        System.out.println(indent + expression);
        for (int i = 0; i < expression.getChildCount(); i++) {
            final Expression child = expression.getChild(i);
            print(child, indent + "\t");
        }
    }
}

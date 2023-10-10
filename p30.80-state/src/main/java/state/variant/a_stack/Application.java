package state.variant.a_stack;


public class Application {
    public static void main(String[] args) {
        final Stack<Integer> stack = new Stack<>(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        try {
            stack.push(60);
        } catch (final Exception e) {
            System.out.println(e);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        try {
            stack.pop();
        } catch (final Exception e) {
            System.out.println(e);
        }
    }
}

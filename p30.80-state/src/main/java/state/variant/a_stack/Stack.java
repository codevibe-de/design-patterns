package state.variant.a_stack;

public class Stack<T> {

    private abstract class State {
        public final String displayName;

        public State(String displayName) {
            this.displayName = displayName;
        }

        public void push(T element) {
            throw new IllegalStateException("Push: error (current state = " + this.displayName + ")");
        }

        public T pop() {
            throw new IllegalStateException("Pop: error (current state = " + this.displayName + ")");
        }

        public T top() {
            throw new IllegalStateException("Top: error (current state = " + this.displayName + ")");
        }

        public boolean isEmpty() {
            return false;
        }

        public boolean isFilled() {
            return false;
        }

        public boolean isFull() {
            return false;
        }
    }

    private class EmptyState extends State {
        public EmptyState() {
            super("empty");
        }

        @Override
        public void push(T element) {
            Stack.this.elements[Stack.this.count++] = element;
            Stack.this.setCurrentState(Stack.this.filledState);
        }

        @Override
        public boolean isEmpty() {
            return true;
        }
    }

    private class FilledState extends State {
        public FilledState() {
            super("filled");
        }

        @Override
        public void push(T element) {
            Stack.this.elements[Stack.this.count++] = element;
            if (Stack.this.count == Stack.this.elements.length) {
                Stack.this.setCurrentState(Stack.this.fullState);
            } else {
                Stack.this.setCurrentState(Stack.this.filledState);
            }
        }

        @Override
        public T pop() {
            Stack.this.count--;
            if (Stack.this.count == 0) {
                Stack.this.setCurrentState(Stack.this.emptyState);
            } else {
                Stack.this.setCurrentState(Stack.this.filledState);
            }
            return Stack.this.elements[Stack.this.count];
        }

        @Override
        public T top() {
            return Stack.this.elements[Stack.this.count - 1];
        }

        @Override
        public boolean isFilled() {
            return true;
        }

    }

    private class FullState extends State {
        public FullState() {
            super("full");
        }

        @Override
        public T pop() {
            Stack.this.count--;
            Stack.this.setCurrentState(Stack.this.filledState);
            return Stack.this.elements[Stack.this.count];
        }

        @Override
        public T top() {
            return Stack.this.elements[Stack.this.count - 1];
        }

        @Override
        public boolean isFull() {
            return true;
        }
    }

    private final T[] elements;
    private int count;

    private final State emptyState = new EmptyState();
    private final State filledState = new FilledState();
    private final State fullState = new FullState();

    private State currentState;

    @SuppressWarnings("unchecked")
    public Stack(int size) {
        if (size < 2) {
            throw new IllegalArgumentException("size must be >= 2");
        }
        this.elements = (T[]) new Object[size];
        this.currentState = this.emptyState;
    }

    private void setCurrentState(State state) {
        System.out.printf("%s ==> %s\n", this.currentState.displayName, state.displayName);
        this.currentState = state;
    }

    public void push(T element) {
        this.currentState.push(element);
    }

    public T pop() {
        return this.currentState.pop();
    }

    public T top() {
        return this.currentState.top();
    }

    public boolean isEmpty() {
        return this.currentState.isEmpty();
    }

    public boolean isFull() {
        return this.currentState.isFull();
    }

    public boolean isFilled() {
        return this.currentState.isFilled();
    }
}

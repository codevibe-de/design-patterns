package state.solution;

public class Door {

    final OpenedState openedState = new OpenedState(this);
    final ClosedState closedState = new ClosedState(this);

    private State currentState = this.closedState;

    public State getState() {
        return this.currentState;
    }

    void setState(State state) {
        System.out.println(this.currentState + " --> " + state);
        this.currentState = state;
    }

    public void open() {
        this.currentState.open();
    }

    public void close() {
        this.currentState.close();
    }
}

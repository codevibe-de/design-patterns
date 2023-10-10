package state.solution;

public abstract class State {

    protected final Door door;

    public State(Door door) {
        this.door = door;
    }

    public void open() {
        throw new IllegalStateException(this.door.getState() + " cannot open");
    }

    public void close() {
        throw new IllegalStateException(this.door.getState() + " cannot close");
    }

    public String toString() {
        return this.getClass().getName();
    }

}
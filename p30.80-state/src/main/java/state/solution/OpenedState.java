package state.solution;

public class OpenedState extends State {

    public OpenedState(Door door) {
        super(door);
    }

    @Override
    public void close() {
        this.door.setState(this.door.closedState);
    }

}

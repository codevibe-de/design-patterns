package state.solution;

public class ClosedState extends State {

    public ClosedState(Door door) {
        super(door);
    }

    @Override
    public void open() {
        this.door.setState(this.door.openedState);
    }

}

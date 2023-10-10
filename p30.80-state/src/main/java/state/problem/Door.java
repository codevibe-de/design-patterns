package state.problem;

public class Door {

    private boolean isOpen;


    public void open() {
        if (this.isOpen) {
            throw new IllegalStateException("door is open");
        }
        System.out.println("closed --> opened");
        this.isOpen = true;
    }

    public void close() {
        if (!this.isOpen) {
            throw new IllegalStateException("door is closed");
        }
        System.out.println("opened --> closed");
        this.isOpen = false;
    }

    public boolean isOpen() {
        return this.isOpen;
    }
}

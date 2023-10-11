package state.solution;

public class Application {

    public static void main(String[] args) {
        final Door door = new Door();
        try {
            door.open();
            door.close();
            door.open();
            door.open();
        } catch (final IllegalStateException e) {
            System.out.println("EXCEPTION: " + e.getMessage());
        }
    }
}

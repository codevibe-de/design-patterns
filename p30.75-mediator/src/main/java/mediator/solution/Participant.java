package mediator.solution;

public class Participant {

    private final Chatroom chatroom;
    private final String name;

    public Participant(Chatroom chatroom, String name) {
        this.chatroom = chatroom;
        this.chatroom.add(this);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void send(String message) {
        this.chatroom.send(this, message);
    }

    public void notify(Participant sender, String message) {
        System.out.printf("User %s received message: %s (Sender = %s)\n", this.name, message,
                sender.name);
    }
}

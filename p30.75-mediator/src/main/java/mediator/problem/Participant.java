package mediator.problem;

import java.util.ArrayList;
import java.util.List;

public class Participant {

    private final String name;
    private final List<Participant> participants = new ArrayList<>();

    public Participant(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void add(Participant participant) {
        this.participants.add(participant);
    }

    public void send(String message) {
        System.out.println();
        System.out.printf("Sender %s sends message: %s\n",
                this.name, message);
        System.out.println("-----------------------------------");
        this.participants.forEach(p -> p.notify(this, message));
    }

    public void notify(Participant sender, String message) {
        System.out.printf("User %s received message: %s (Sender = %s)\n",
                this.name, message, sender.name);
    }

}

package mediator.solution;

import java.util.ArrayList;
import java.util.List;

public class Chatroom {
    private final List<Participant> participants = new ArrayList<>();

    public void add(Participant participant) {
        this.participants.add(participant);
    }

    public void remove(Participant participant) {
        this.participants.remove(participant);
    }

    public void send(final Participant sender, final String message) {
        System.out.println();
        System.out.printf("Sender &s sends message: %s\n",
                sender.getName(), message);
        System.out.println("-----------------------------------");
        this.participants.forEach(p -> {
            if (p != sender) {
                p.notify(sender, message);
            }
        });
    }

}

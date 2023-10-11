package mediator.solution;

public class Application {

    public static void main(String[] args) {
        final Chatroom chatroom = new Chatroom();

        final Participant meier = new Participant(chatroom, "Meier");
        final Participant mueller = new Participant(chatroom, "Mueller");
        final Participant franke = new Participant(chatroom, "Franke");

        meier.send("Glueck");
        mueller.send("Glanz");
        franke.send("Ruhm");
    }

}

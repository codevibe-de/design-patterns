package mediator.problem;

public class Application {

    public static void main(String[] args) {
        final Participant meier = new Participant("Meier");
        final Participant mueller = new Participant("Mueller");
        final Participant franke = new Participant("Franke");
        meier.add(mueller);
        meier.add(franke);
        mueller.add(meier);
        mueller.add(franke);
        franke.add(meier);
        franke.add(mueller);
        meier.send("Glueck");
        mueller.send("Glanz");
        franke.send("Ruhm");
    }

}

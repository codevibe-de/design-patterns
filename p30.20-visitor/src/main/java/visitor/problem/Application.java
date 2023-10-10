package visitor.problem;

public class Application {

    public static void main(String[] args) throws Exception {
        final Firma f = new Firma();

        f.add(new Lohnempfaenger(1000, "Meier", 160, 25));
        f.add(new Gehaltsempfaenger(2000, "Mueller", 3000));
        f.add(new Lohnempfaenger(3000, "Franke", 80, 25));

        System.out.println("Gesamtverdienst = " + f.getGesamtVerdienst());
        for (final Mitarbeiter m : f.getList()) {
            System.out.print(m.nr + " " + m.name + " ");
            if (m instanceof Lohnempfaenger l) {
                System.out.println(l.anzStd + " " + l.stdLohn);
            } else if (m instanceof Gehaltsempfaenger g) {
                System.out.println(g.gehalt);
            }
        }
        double summe = 0;
        for (final Mitarbeiter m : f.getList()) {
            if (m instanceof Gehaltsempfaenger) {
                summe += m.getVerdienst();
            }
        }
        System.out.println("Gesamntverdienst aller Gehaltsempfaenger = " + summe);
    }
}

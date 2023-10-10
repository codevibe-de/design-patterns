package visitor.solution;


public class Application {

    public static void main(String[] args) throws Exception {
        final Firma f = new Firma();

        f.add(new Lohnempfaenger(1000, "Meier", 160, 25));
        f.add(new Gehaltsempfaenger(2000, "Mueller", 3000));
        f.add(new Lohnempfaenger(3000, "Franke", 80, 25));

        System.out.println("Gesamtverdienst = " + f.getGesamtVerdienst());
        f.iterate(new MitarbeiterPrintVisitor());
        final MitarbeiterGehaltssummeVisitor v = new MitarbeiterGehaltssummeVisitor();
        f.iterate(v);
        System.out.println(
                "Gesamntverdienst aller Gehaltsempfaenger = " + v.getSumme());
    }
}

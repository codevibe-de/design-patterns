package visitor.solution;

public class Gehaltsempfaenger extends Mitarbeiter {

    public final double gehalt;

    public Gehaltsempfaenger(int nr, String name, double gehalt) {
        super(nr, name);
        this.gehalt = gehalt;
    }

    @Override
    public double getVerdienst() {
        return this.gehalt;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + this.gehalt;
    }

    @Override
    public void accept(MitarbeiterVisitor visitor) {
        visitor.visit(this);
    }

}

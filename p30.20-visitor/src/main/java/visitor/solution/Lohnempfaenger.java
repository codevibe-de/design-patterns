package visitor.solution;

public class Lohnempfaenger extends Mitarbeiter {

    public final double anzStd;
    public final double stdLohn;

    public Lohnempfaenger(int nr, String name, double anzStd, double stdLohn) {
        super(nr, name);
        this.anzStd = anzStd;
        this.stdLohn = stdLohn;
    }

    @Override
    public double getVerdienst() {
        return this.anzStd * this.stdLohn;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + this.anzStd + ", " + this.stdLohn;
    }

    @Override
    public void accept(MitarbeiterVisitor visitor) {
        visitor.visit(this);
    }

}

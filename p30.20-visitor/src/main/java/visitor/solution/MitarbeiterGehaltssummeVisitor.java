package visitor.solution;

public class MitarbeiterGehaltssummeVisitor implements MitarbeiterVisitor {

    private int summe = 0;

    @Override
    public void visit(Lohnempfaenger l) {
        // do nothing
    }

    @Override
    public void visit(Gehaltsempfaenger g) {
        this.summe += g.getVerdienst();
    }

    public int getSumme() {
        return this.summe;
    }

}

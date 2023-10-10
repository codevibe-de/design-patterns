package visitor.solution;

public interface MitarbeiterVisitor {

    void visit(Lohnempfaenger l);

    void visit(Gehaltsempfaenger g);

}

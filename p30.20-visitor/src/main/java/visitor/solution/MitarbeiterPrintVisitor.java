package visitor.solution;

public class MitarbeiterPrintVisitor implements MitarbeiterVisitor {

    @Override
    public void visit(Lohnempfaenger l) {
        System.out.println(l.nr + " " + l.name + " " + l.stdLohn + " " + l.anzStd);
    }

    @Override
    public void visit(Gehaltsempfaenger g) {
        System.out.println(g.nr + " " + g.name + " " + g.gehalt);
    }

}

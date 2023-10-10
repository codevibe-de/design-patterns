package visitor.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Firma {

    private final List<Mitarbeiter> list = new ArrayList<>();

    public void add(Mitarbeiter mitarbeiter) {
        this.list.add(mitarbeiter);
    }

    public List<Mitarbeiter> getList() {
        return Collections.unmodifiableList(this.list);
    }

    public double getGesamtVerdienst() {
        double summe = 0;
        for (final Mitarbeiter m : this.list) {
            summe += m.getVerdienst();
        }
        return summe;
    }

    public void iterate(MitarbeiterVisitor visitor) {
        for (final Mitarbeiter m : this.list) {
            m.accept(visitor);
        }
    }

}

package visitor.problem;

public abstract class Mitarbeiter {

    public final int nr;
    public final String name;

    public Mitarbeiter(int nr, String name) {
        this.nr = nr;
        this.name = name;
    }

    abstract public double getVerdienst();

    @Override
    public String toString() {
        return this.nr + ", " + this.name;
    }

}

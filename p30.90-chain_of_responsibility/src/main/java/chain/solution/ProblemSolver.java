package chain.solution;

public abstract class ProblemSolver {

    private ProblemSolver next;

    public abstract boolean solve(String[] tokens);

    public void setNext(ProblemSolver next) {
        this.next = next;
    }

    protected boolean sendToNext(String[] tokens) {
        if (this.next != null) {
            return this.next.solve(tokens);
        }
        return false;
    }

}

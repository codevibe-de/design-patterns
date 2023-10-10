package chain.solution;

public class ProblemSolverChain {

    private ProblemSolver first;
    private ProblemSolver last;

    public void append(ProblemSolver problemSolver) {
        if (this.first == null) {
            this.first = problemSolver;
        } else {
            this.last.setNext(problemSolver);
        }
        this.last = problemSolver;
    }

    public boolean solve(String[] tokens) {
        return this.first != null && this.first.solve(tokens);
    }

}

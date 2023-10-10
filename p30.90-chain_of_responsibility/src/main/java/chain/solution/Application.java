package chain.solution;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Application {

    public static void main(String[] args) throws Exception {
        final ProblemSolverChain chain = new ProblemSolverChain();

        chain.append(new PlusSolver());
        chain.append(new SqrSolver());
        chain.append(new ConcatSolver());

        System.out.println("a problem (or exit)");
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (String problem = reader.readLine(); !"exit".equals(problem); problem = reader.readLine()) {
            final String[] tokens = problem.split(" ");
            if (!chain.solve(tokens)) {
                System.out.println("Problem cannot be solved");
            }
        }
    }

}

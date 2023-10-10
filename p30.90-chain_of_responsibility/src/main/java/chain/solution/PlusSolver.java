package chain.solution;

public class PlusSolver extends ProblemSolver {

    @Override
    public boolean solve(String[] tokens) {
        if (!(tokens.length == 3 && tokens[1].equals("+"))) {
            return this.sendToNext(tokens);
        }
        final int x = Integer.parseInt(tokens[0]);
        final int y = Integer.parseInt(tokens[2]);
        final int result = x + y;
        System.out.println(result);
        return true;
    }

}

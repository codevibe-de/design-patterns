package chain.solution;

public class ConcatSolver extends ProblemSolver {

    @Override
    public boolean solve(String[] tokens) {
        if (!(tokens.length == 3 && tokens[0].equals("concat"))) {
            return this.sendToNext(tokens);
        }
        final String result = tokens[1] + tokens[2];
        System.out.println(result);
        return true;
    }

}

package chain.solution;

public class SqrSolver extends ProblemSolver {

    @Override
    public boolean solve(String[] tokens) {
        if (!(tokens.length == 2 && tokens[0].equals("sqr"))) {
            return this.sendToNext(tokens);
        }
        final int value = Integer.parseInt(tokens[1]);
        final int result = value * value;
        System.out.println(result);
        return true;
    }

}

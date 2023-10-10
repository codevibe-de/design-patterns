package chain.problem;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Application {

    public static void main(String[] args) throws Exception {
        System.out.println("a problem (or exit)");
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (String problem = reader.readLine(); !"exit".equals(problem); problem = reader.readLine()) {
            final String[] tokens = problem.split(" ");
            if (!solve(tokens)) {
                System.out.println("Problem cannot be solved");
            }
        }
    }

    static private boolean solve(String[] tokens) {
        if (tokens.length == 3 && tokens[1].equals("+")) {
            final int x = Integer.parseInt(tokens[0]);
            final int y = Integer.parseInt(tokens[2]);
            final int sum = x + y;
            System.out.println(sum);
            return true;
        }
        if (tokens.length == 2 && tokens[0].equals("sqr")) {
            final int v = Integer.parseInt(tokens[1]);
            final int sqr = v * v;
            System.out.println(sqr);
            return true;
        }
        if (tokens.length == 3 && tokens[0].equals("concat")) {
            System.out.println(tokens[1] + tokens[2]);
            return true;
        }
        return false;
    }

}

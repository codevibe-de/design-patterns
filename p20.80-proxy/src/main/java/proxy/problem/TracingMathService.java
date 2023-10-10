package proxy.problem;

public class TracingMathService {

    public boolean trace = false;

    public int sum(int x, int y) {
        if (this.trace) {
            System.out.println(">> sum(" + x + ", " + y + ")");
        }
        final int result = x + y;
        if (this.trace) {
            System.out.println("<< sum(" + x + ", " + y + ") --> " + result);
        }
        return result;
    }

    public int diff(int x, int y) {
        if (this.trace) {
            System.out.println(">> diff(" + x + ", " + y + ")");
        }
        final int result = x - y;
        if (this.trace) {
            System.out.println("<< diff(" + x + ", " + y + ") --> " + result);
        }
        return result;
    }

}

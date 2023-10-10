package proxy.problem;

public class TracingMathService {

    public int sum(int x, int y) {
        System.out.println(">> sum(" + x + ", " + y + ")");
        final int result = x + y;
        System.out.println("<< sum(" + x + ", " + y + ") --> " + result);
        return result;
    }

    public int diff(int x, int y) {
        System.out.println(">> diff(" + x + ", " + y + ")");
        final int result = x - y;
        System.out.println("<< diff(" + x + ", " + y + ") --> " + result);
        return result;
    }

}

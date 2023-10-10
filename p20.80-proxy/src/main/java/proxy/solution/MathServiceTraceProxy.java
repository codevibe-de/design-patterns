package proxy.solution;

import proxy.MathService;

// PROXY pattern
public class MathServiceTraceProxy implements MathService {

    private final MathService target;

    public MathServiceTraceProxy(MathService target) {
        this.target = target;
    }

    @Override
    public int sum(int x, int y) {
        // before invoke
        System.out.println(">> sum(" + x + ", " + y + ")");
        // invoke
        final int result = this.target.sum(x, y);
        // after invoke
        System.out.println("<< sum(" + x + ", " + y + ") --> " + result);
        return result;
    }

    @Override
    public int diff(int x, int y) {
        System.out.println(">> diff(" + x + ", " + y + ")");
        final int result = this.target.diff(x, y);
        System.out.println("<< diff(" + x + ", " + y + ") --> " + result);
        return result;
    }
}

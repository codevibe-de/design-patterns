package proxy.solution;

import proxy.MathService;
import proxy.PlainMathService;

public class Application {

    public static void main(String[] args) {
        final MathService mathService = new MathServiceTraceProxy(new PlainMathService());

        final int sum = mathService.sum(40, 2);
        System.out.println(sum);

        final int diff = mathService.sum(80, 3);
        System.out.println(diff);
    }
}

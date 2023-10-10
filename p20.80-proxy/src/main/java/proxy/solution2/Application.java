package proxy.solution2;

import proxy.MathService;
import proxy.PlainMathService;

public class Application {

    public static void main(String[] args) {
        final TraceHandler handler  = new TraceHandler(new PlainMathService());

        final MathService mathService = new MathServiceProxy(handler);

        final int sum = mathService.sum(40, 2);
        System.out.println(sum);

        final int diff = mathService.sum(80, 3);
        System.out.println(diff);
    }
}

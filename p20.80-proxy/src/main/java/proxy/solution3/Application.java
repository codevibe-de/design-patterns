package proxy.solution3;

import proxy.MathService;
import proxy.PlainMathService;

import java.lang.reflect.Proxy;

public class Application {

    public static void main(String[] args) {

        final TraceHandler handler = new TraceHandler(new PlainMathService());

        final MathService mathService = (MathService) Proxy.newProxyInstance(
                Application.class.getClassLoader(),
                new Class<?>[]{MathService.class},
                handler);

        final int sum = mathService.sum(40, 2);
        System.out.println(sum);

        final int diff = mathService.sum(80, 3);
        System.out.println(diff);
    }
}

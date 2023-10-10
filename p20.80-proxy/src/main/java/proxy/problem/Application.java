package proxy.problem;

public class Application {

    public static void main(String[] args) {
        final TracingMathService mathService = new TracingMathService();
        mathService.trace = true;

        final int sum = mathService.sum(40, 2);
        System.out.println(sum);

        final int diff = mathService.sum(80, 3);
        System.out.println(diff);
    }

}

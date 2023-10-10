package proxy.problem;

public class Application {

    // PROBLEM is that we combine two aspects in one class: the math stuff and the tracing
    public static void main(String[] args) {
        final TracingMathService mathService = new TracingMathService();

        final int sum = mathService.sum(40, 2);
        System.out.println(sum);

        final int diff = mathService.sum(80, 3);
        System.out.println(diff);
    }

}

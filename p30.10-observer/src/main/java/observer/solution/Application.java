package observer.solution;

@SuppressWarnings("Convert2MethodRef")
public class Application {

    public static void main(String[] args) throws Exception {
        final Display display = new Display();
        final Database database = new Database();
        final Calculator calculator = new Calculator();

        // use ADAPTER pattern to register observers -- the lambdas below adapt to the observer interface
        calculator.addCalculatorObserver(e -> display.display(e));
        calculator.addCalculatorObserver(e -> database.insert(e));

        // perform logic
        calculator.add(20);
        calculator.subtract(5);
        System.out.println("value = " + calculator.getValue());
    }
}

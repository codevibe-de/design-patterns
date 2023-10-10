package observer.solution;

@SuppressWarnings("Convert2MethodRef")
public class Application {

    public static void main(String[] args) throws Exception {
        final Display display = new Display();
        final Database database = new Database();
        final Calculator calculator = new Calculator();

        calculator.addCalculatorObserver(e -> display.display(e));
        calculator.addCalculatorObserver(e -> database.insert(e));

        calculator.add(20);
        calculator.subtract(5);
        System.out.println("value = " + calculator.getValue());
    }
}

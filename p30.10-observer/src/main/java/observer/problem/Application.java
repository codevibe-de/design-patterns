package observer.problem;

/**
 * Operations performed on the calculator shall be observed -- shown in some display as well as recorded in a database.
 */
public class Application {

    // PROBLEM: internal systems are not connected - we need to manually call them
    public static void main(String[] args) throws Exception {
        final Calculator calculator = new Calculator();
        final Display display = new Display();
        final Database database = new Database();

        calculator.add(20);
        display.write("add 20");
        database.insert("add 20");

        calculator.subtract(5);
        display.write("subtract 5");
        database.insert("subtract 5");

        System.out.println("value = " + calculator.getValue());
    }

}

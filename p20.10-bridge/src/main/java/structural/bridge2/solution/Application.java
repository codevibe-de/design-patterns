package structural.bridge2.solution;

public class Application {

    public static void main(String[] args) {
        PaginatingPrinter printer = new PaginatingPrinter(new HTMLPrintingImpl());
        printer.print("Good Morning!");
        printer.addPageBreak();
        printer.print("Good Evening...");
    }

}

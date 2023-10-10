package structural.bridge2.solution;

class PaginatingPrinter extends Printer {

    public PaginatingPrinter(PrintingImpl impl) {
        super(impl);
    }

    public void addPageBreak() {
        impl.print("-------------------------------------------");
    }
}

package structural.bridge2.solution;

class PaginatingPrinter extends Printer {

    public PaginatingPrinter(PrintingImpl impl) {
        super(impl);
    }

    @Override
    public void print(Object content) {
        impl.print(content.toString());
    }

    public void addPageBreak() {
        impl.print("-------------------------------------------");
    }
}

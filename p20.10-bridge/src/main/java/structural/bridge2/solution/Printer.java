package structural.bridge2.solution;

// base of the "abstraction" hierarchy (within the BRIDGE design pattern)
public class Printer {

    protected final PrintingImpl impl;

    public Printer(PrintingImpl impl) {
        this.impl = impl;
    }

    public void print(Object content) {
        this.impl.print(content.toString());
    }

}


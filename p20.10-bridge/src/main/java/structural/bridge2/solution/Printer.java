package structural.bridge2.solution;

public abstract class Printer {

    protected PrintingImpl impl;

    public Printer(PrintingImpl impl) {
        this.impl = impl;
    }

    public abstract void print(Object content);

    public PrintingImpl getImpl() {
        return impl;
    }

    public void setImpl(PrintingImpl impl) {
        this.impl = impl;
    }

}


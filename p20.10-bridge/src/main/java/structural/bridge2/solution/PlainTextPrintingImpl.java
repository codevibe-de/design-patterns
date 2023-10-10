package structural.bridge2.solution;

class PlainTextPrintingImpl implements PrintingImpl {

    @Override
    public void print(String what) {
        System.out.println(what);
    }

}

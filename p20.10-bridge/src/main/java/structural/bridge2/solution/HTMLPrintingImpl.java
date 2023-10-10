package structural.bridge2.solution;

class HTMLPrintingImpl implements PrintingImpl {

    @Override
    public void print(String what) {
        System.out.println("<p>" + what + "</p>");
    }

}

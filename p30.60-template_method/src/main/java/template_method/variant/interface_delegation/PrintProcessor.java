package template_method.variant.interface_delegation;

public class PrintProcessor implements Processor {

    @Override
    public void initialize() {
        System.out.println("Jetzt geht's los");
    }

    @Override
    public void process(char ch) {
        System.out.print(ch);
    }


    @Override
    public void terminate() {
        System.out.println("Das war's dann");
    }
}
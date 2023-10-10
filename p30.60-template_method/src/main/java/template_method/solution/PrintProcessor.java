package template_method.solution;

public class PrintProcessor extends FileProcessor {

    @Override
    protected void initialize() {
        System.out.println("Jetzt geht's los");
    }

    @Override
    protected void process(char ch) {
        System.out.print(ch);
    }

    @Override
    protected void terminate() {
        System.out.println("Das war's dann");
    }
}
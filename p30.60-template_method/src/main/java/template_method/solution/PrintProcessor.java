package template_method.solution;

public class PrintProcessor extends FileProcessor {

    @Override
    protected void initialize() {
        System.out.print("\"");
    }

    @Override
    protected void process(char ch) {
        System.out.print(ch);
        if (ch == '\n') {
            System.out.print(" ");
        }
    }

    @Override
    protected void terminate() {
        System.out.println("\"");
    }
}
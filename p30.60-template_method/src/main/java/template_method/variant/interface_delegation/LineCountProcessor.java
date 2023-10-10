package template_method.variant.interface_delegation;

public class LineCountProcessor implements Processor {

    private int count;

    public int getCount() {
        return this.count;
    }

    @Override
    public void initialize() {
        this.count = 0;
    }

    @Override
    public void process(char ch) {
        if (ch == '\n') {
            this.count++;
        }
    }

    @Override
    public void terminate() {
        // do nothing
    }
}
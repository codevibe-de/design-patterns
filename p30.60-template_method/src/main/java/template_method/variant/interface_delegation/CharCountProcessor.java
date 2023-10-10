package template_method.variant.interface_delegation;

public class CharCountProcessor implements Processor {

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
        this.count++;
    }

    @Override
    public void terminate() {
        // do nothing
    }
}

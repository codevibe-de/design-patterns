package template_method.solution;

public class LineCountProcessor extends FileProcessor {

    private int count;

    public int getCount() {
        return this.count;
    }

    @Override
    protected void initialize() {
        this.count = 0;
    }

    @Override
    protected void process(char ch) {
        if (ch == '\n') {
            this.count++;
        }
    }
}
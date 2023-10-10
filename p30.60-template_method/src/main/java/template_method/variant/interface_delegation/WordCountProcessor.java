package template_method.variant.interface_delegation;

public class WordCountProcessor implements Processor {

    private int count;
    private boolean inWord;

    public int getCount() {
        return this.count;
    }

    @Override
    public void initialize() {
        this.count = 0;
        this.inWord = false;
    }

    @Override
    public void process(char ch) {
        if (!this.inWord && !Character.isWhitespace(ch)) {
            this.count++;
            this.inWord = true;
        } else if (this.inWord && Character.isWhitespace(ch)) {
            this.inWord = false;
        }
    }

    @Override
    public void terminate() {
        // do nothing
    }
}


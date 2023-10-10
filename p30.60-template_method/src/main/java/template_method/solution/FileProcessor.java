package template_method.solution;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public abstract class FileProcessor {

    final public void run(String filename) {
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(filename))) {
            int ch = reader.read();
            this.initialize();
            while (ch != -1) {
                this.process((char) ch);
                ch = reader.read();
            }
            this.terminate();
        } catch (final Exception e) {
            System.out.println(e);
        }
    }

    protected void initialize() {
    }

    protected abstract void process(char ch);

    protected void terminate() {
    }
}

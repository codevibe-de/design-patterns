package template_method.solution;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public abstract class FileProcessor {

    // this is the TEMPLATE METHOD
    final public void run(String filename) {
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(filename))) {
            int ch = reader.read();
            this.initialize();  // hook
            while (ch != -1) {
                this.process((char) ch); // hook
                ch = reader.read();
            }
            this.terminate(); // hook
        } catch (final Exception e) {
            System.out.println(e);
        }
    }

    // this hook is intentionally blank
    protected void initialize() {
    }

    // this hook MUST be implemented by subclasses
    protected abstract void process(char ch);

    // this hook is intentionally blank
    protected void terminate() {
    }
}

package template_method.variant.interface_delegation;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileProcessor {

    final public void run(String filename, Processor processor) {
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(filename))) {
            int ch = reader.read();
            processor.initialize();
            while (ch != -1) {
                processor.process((char) ch);
                ch = reader.read();
            }
            processor.terminate();
        } catch (final Exception e) {
            System.out.println(e);
        }
    }
}

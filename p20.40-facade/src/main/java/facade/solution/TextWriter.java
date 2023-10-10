package facade.solution;

import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

// FACADE to a PrintWriter
public class TextWriter implements Closeable {

    private final PrintWriter pw;

    public TextWriter(String filename) {
        try {
            this.pw = new PrintWriter(new FileOutputStream(filename));
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeln(String line) {
        this.pw.println(line);
    }

    @Override
    public void close() {
        this.pw.close();
    }

}

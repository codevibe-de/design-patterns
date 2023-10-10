package facade.solution;

import java.io.*;
import java.util.Iterator;

// FACADE to an InputStream, which provides the Iterable interface
public class TextReader implements Closeable, Iterable<String> {

    private final BufferedReader br;

    public TextReader(String filename) {
        try {
            this.br = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void close() {
        try {
            this.br.close();
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            String line = null;

            @Override
            public boolean hasNext() {
                try {
                    this.line = TextReader.this.br.readLine();
                } catch (final IOException e) {
                    throw new RuntimeException(e);
                }
                return this.line != null;
            }

            @Override
            public String next() {
                return this.line;
            }
        };
    }
}

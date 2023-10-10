package decorator.variations.reader;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

// Decorates a Reader and adds a method for reading a Number instance
public class NumberReader extends Reader {

    private final Reader reader;
    private final StringBuilder buf = new StringBuilder();
    private int currentChar = ' ';

    public NumberReader(Reader reader) {
        this.reader = reader;
    }

    public Number readNumber() throws IOException, EOFException, NumberFormatException {
        this.skipWhitespace();
        if (this.currentChar == -1) {
            return null;
        }
        if (!Character.isDigit(this.currentChar)) {
            throw new NumberFormatException("digit expected. But found: " + this.currentChar);
        }
        this.buf.setLength(0);
        while (Character.isDigit(this.currentChar)) {
            this.buf.append((char) this.currentChar);
            this.next();
        }
        if (this.currentChar != '.') {
            return Integer.valueOf(this.buf.toString());
        }
        this.buf.append('.');
        this.next();
        while (Character.isDigit(this.currentChar)) {
            this.buf.append((char) this.currentChar);
            this.next();
        }
        return Double.valueOf(this.buf.toString());
    }

    @Override
    public void close() throws IOException {
        this.reader.close();
    }

    @Override
    public int read(char[] buf, int offset, int length) throws IOException {
        return this.reader.read(buf, offset, length);
    }

    private void skipWhitespace() throws IOException, EOFException {
        while (Character.isWhitespace(this.currentChar)) {
            this.currentChar = this.reader.read();
        }
    }

    private void next() throws IOException {
        this.currentChar = this.reader.read();
    }
}


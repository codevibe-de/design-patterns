package interpreter.solution;

import util.xml.XMLScanner;

import java.io.InputStream;

public class LibraryParser {

    private final XMLScanner scanner;

    public LibraryParser(InputStream in) {
        this.scanner = new XMLScanner(in);
    }

    public void parse() {
        this.scanner.start("library");
        this.parseAuthors();
        this.parseBooks();
        this.scanner.end("library");
    }

    private void parseAuthors() {
        this.scanner.start("authors");
        while (this.scanner.isStart("author")) {
            this.parseAuthor();
        }
        this.scanner.end("authors");
    }

    private void parseBooks() {
        this.scanner.start("books");
        while (this.scanner.isStart("book")) {
            this.parseBook();
        }
        this.scanner.end("books");
    }

    private void parseAuthor() {
        this.scanner.start("author");
        this.parseSimpleElement("id");
        this.parseSimpleElement("firstname");
        this.parseSimpleElement("lastname");
        this.scanner.end("author");
    }

    private void parseBook() {
        this.scanner.start("book");
        this.parseSimpleElement("isbn");
        this.parseSimpleElement("title");
        this.parseSimpleElement("author-id");
        this.parseSimpleElement("price");
        this.scanner.end("book");
    }

    private void parseSimpleElement(String name) {
        final String text = this.scanner.startTextEnd(name);
        System.out.println("parseSimpleElement: " + name + " " + text);
    }

}

package interpreter.solution2;

import util.xml.XMLScanner;

import java.io.InputStream;

public class LibraryParser {

    private final XMLScanner scanner;
    private final Library library = new Library();

    public LibraryParser(InputStream in) {
        this.scanner = new XMLScanner(in);
    }

    public Library parse() {
        this.scanner.start("library");
        this.parseAuthors();
        this.parseBooks();
        this.scanner.end("library");
        return this.library;
    }

    private void parseAuthors() {
        this.scanner.start("authors");
        while (this.scanner.isStart("author")) {
            this.library.add(this.parseAuthor());
        }
        this.scanner.end("authors");
    }

    private void parseBooks() {
        this.scanner.start("books");
        while (this.scanner.isStart("book")) {
            this.library.add(this.parseBook());
        }
        this.scanner.end("books");
    }

    private Author parseAuthor() {
        final Author author = new Author();
        this.scanner.start("author");
        author.setId(Integer.parseInt(this.parseSimpleElement("id")));
        author.setFirstname(this.parseSimpleElement("firstname"));
        author.setLastname(this.parseSimpleElement("lastname"));
        this.scanner.end("author");
        return author;
    }

    private Book parseBook() {
        final Book book = new Book();
        this.scanner.start("book");
        book.setIsbn(this.parseSimpleElement("isbn"));
        book.setTitle(this.parseSimpleElement("title"));
        book.setAuthor(this.library.getAuthor(Integer.parseInt(this.parseSimpleElement("author-id"))));
        book.setPrice(Double.parseDouble(this.parseSimpleElement("price")));
        this.scanner.end("book");
        return book;
    }

    private String parseSimpleElement(String name) {
        return this.scanner.startTextEnd(name);
    }

}

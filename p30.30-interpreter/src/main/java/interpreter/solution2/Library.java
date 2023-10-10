package interpreter.solution2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {

    private final List<Author> authors = new ArrayList<>();
    private final List<Book> books = new ArrayList<>();

    public void add(Author author) {
        this.authors.add(author);
    }

    public void add(Book book) {
        this.books.add(book);
    }

    public Author getAuthor(int id) {
        for (final Author author : this.authors) {
            if (author.getId() == id) {
                return author;
            }
        }
        return null;
    }

    public List<Author> getAuthors() {
        return Collections.unmodifiableList(this.authors);
    }

    public List<Book> getBooks() {
        return Collections.unmodifiableList(this.books);
    }
}

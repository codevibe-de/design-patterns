package de.codevibe.book;

public class InMemoryBookRepository implements BookRepository {

    @Override
    public Book findByIsbn(String isbn) {
        return new Book(isbn, "Some Book");
    }

}

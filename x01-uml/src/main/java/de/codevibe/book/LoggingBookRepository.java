package de.codevibe.book;

// DECORATOR pattern
public class LoggingBookRepository implements BookRepository {

    private final BookRepository decoratedRepository;

    public LoggingBookRepository(BookRepository decoratedRepository) {
        this.decoratedRepository = decoratedRepository;
    }

    @Override
    public Book findByIsbn(String isbn) {
        System.out.println("Finding book by isbn: " + isbn);
        return decoratedRepository.findByIsbn(isbn);
    }
}

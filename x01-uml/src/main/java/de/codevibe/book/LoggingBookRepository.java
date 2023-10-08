package de.codevibe.book;

// DECORATOR pattern
public class LoggingBookRepository implements BookRepository {

    private final LoggingBookRepository decoratedRepository;

    public LoggingBookRepository(LoggingBookRepository decoratedRepository) {
        this.decoratedRepository = decoratedRepository;
    }

    @Override
    public Book findByIsbn(String isbn) {
        System.out.println("Finding book by isbn: " + isbn);
        return decoratedRepository.findByIsbn(isbn);
    }
}

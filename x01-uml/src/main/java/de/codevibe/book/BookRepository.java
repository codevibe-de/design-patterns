package de.codevibe.book;

public interface BookRepository {

    Book findByIsbn(String isbn);

}

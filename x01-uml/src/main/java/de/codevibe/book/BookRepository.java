package de.codevibe.book;

public interface BookRepository extends Repository {

    Book findByIsbn(String isbn);

}

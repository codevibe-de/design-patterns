package de.codevibe.book;

public final class Book {

    private final String isbn;
    private final String title;

    Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String isbn() {
        return isbn;
    }

    public String title() {
        return title;
    }

}

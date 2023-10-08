package de.codevibe.book;

public class LibraryApp {

    public static void main(String[] args) {
        Book book = new InMemoryBookRepository().findByIsbn("123-456");
    }

}

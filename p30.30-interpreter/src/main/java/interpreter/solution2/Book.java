package interpreter.solution2;

public class Book {

    private String isbn;
    private String title;
    private double price;
    private Author author;

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book [isbn=" + this.isbn + ", title=" + this.title + ", price=" + this.price + ", author="
                + this.author + "]";
    }

}

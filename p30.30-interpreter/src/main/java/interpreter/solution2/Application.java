package interpreter.solution2;

import java.io.FileInputStream;

public class Application {

    public static void main(String[] args) throws Exception {
        final LibraryParser parser = new LibraryParser(new FileInputStream("src/library.xml"));
        final Library library = parser.parse();
        library.getAuthors().forEach(System.out::println);
        library.getBooks().forEach(System.out::println);
    }
}

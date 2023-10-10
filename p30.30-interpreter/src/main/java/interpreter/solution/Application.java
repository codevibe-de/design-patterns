package interpreter.solution;

public class Application {

    public static void main(String[] args) throws Exception {
        final LibraryParser parser = new LibraryParser(Application.class.getResourceAsStream("/library.xml"));
        parser.parse();
    }
}

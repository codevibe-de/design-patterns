package memento.problem;

public class Application {

    public static void main(String[] args) throws Exception {
        final Document doc = new Document();
        doc.append(new Document.FontElement("Arial", 12));
        doc.append(new Document.TextElement("Hello"));
        doc.append(new Document.FontElement("Courier", 14));
        doc.append(new Document.TextElement("World"));
        doc.remove(2);
        doc.display();
    }
}

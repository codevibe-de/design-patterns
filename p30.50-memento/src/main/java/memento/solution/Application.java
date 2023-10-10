package memento.solution;

public class Application {

    public static void main(String[] args) throws Exception {
        final Document doc = new Document();
        doc.append(new Document.FontElement("Arial", 12));
        doc.append(new Document.TextElement("Hello"));
        doc.append(new Document.FontElement("Courier", 14));
        doc.append(new Document.TextElement("World"));
        final Caretaker caretaker1 = new Caretaker();
        caretaker1.setMemento(new Document.Memento(doc));
        doc.append(new Document.TextElement("Spring"));
        doc.append(new Document.TextElement("Summer"));
        doc.display();
        System.out.println("---------------------");
        caretaker1.getMemento().restore(doc);
        doc.display();
    }
}

package memento.solution;

public class Caretaker {
    private Document.Memento memento;

    public Document.Memento getMemento() {
        return this.memento;
    }

    public void setMemento(Document.Memento memento) {
        this.memento = memento;
    }
}

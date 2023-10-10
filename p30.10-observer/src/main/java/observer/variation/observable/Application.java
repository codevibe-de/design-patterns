package observer.variation.observable;

public class Application {

    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.addObserver(new ObserverA());
        subject.addObserver(new ObserverB());
        subject.setState(333);
        subject.setState(4711);
    }
}

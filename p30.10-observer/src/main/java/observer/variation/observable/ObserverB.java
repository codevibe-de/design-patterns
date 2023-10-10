package observer.variation.observable;

import java.util.Observable;
import java.util.Observer;

public class ObserverB implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        final Subject subject = (Subject) o;
        System.out.println("ObserverB: new State = " + subject.getState());
    }
}
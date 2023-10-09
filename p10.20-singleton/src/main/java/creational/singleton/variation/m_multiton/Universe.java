package creational.singleton.variation.m_multiton;

import java.util.ArrayList;
import java.util.List;

public enum Universe {

    INSTANCE;

    private final List<Star> stars = new ArrayList<>();

    public void add(Star star) {
        this.stars.add(star);
    }

    public int size() {
        return this.stars.size();
    }

    public Star get(int index) {
        return this.stars.get(index);
    }
}

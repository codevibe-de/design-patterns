package creational.singleton.variation.c_simple_enum;

import creational.singleton.Star;

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

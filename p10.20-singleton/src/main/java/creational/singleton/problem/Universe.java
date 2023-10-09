package creational.singleton.problem;

import creational.singleton.Star;

import java.util.ArrayList;
import java.util.List;

public class Universe {

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

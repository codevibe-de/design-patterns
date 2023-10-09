package creational.singleton.solution;

import creational.singleton.Star;

import java.util.ArrayList;
import java.util.List;

public class Universe {

    //
    // SINGLETON pattern
    //

    private static Universe instance = new Universe();

    public static Universe getInstance() {
        return instance;
    }

    private Universe() {
    }

    //
    // star management
    //

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

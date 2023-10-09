package creational.singleton.variation.m_multiton;

import java.util.HashMap;
import java.util.Map;

public class Star {

    //
    // MULTITON pattern
    //

    private static Map<String, Star> INSTANCE_POOL = new HashMap<>();

    public static Star getStar(String name) {
        Star star = INSTANCE_POOL.get(name);
        if (star == null) {
            synchronized (INSTANCE_POOL) {
                star = INSTANCE_POOL.get(name);
                if (star == null) {
                    star = new Star(name);
                    INSTANCE_POOL.put(name, star);
                }
            }
        }
        return star;
    }

    private Star(String name) {
        this.name = name;
    }

    //
    // misc.
    //

    public final String name;

    @Override
    public String toString() {
        return "Star [name=" + this.name + "]";
    }

}

package creational.singleton.variation.m_multiton;

import java.util.HashMap;
import java.util.Map;

public class Star {

    private static Map<String, Star> INSTANCE_POOL = new HashMap<>();

    public static Star getStar(String name) {
        Star star = INSTANCE_POOL.get(name);
        if (star == null) {
            synchronized (INSTANCE_POOL) {
                star = new Star(name);
                INSTANCE_POOL.put(name, star);
            }
        }
        return star;
    }

    public final String name;

    private Star(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Star [name=" + this.name + "]";
    }

}

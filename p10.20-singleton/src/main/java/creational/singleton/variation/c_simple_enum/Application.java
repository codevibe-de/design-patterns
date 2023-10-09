package creational.singleton.variation.c_simple_enum;

import creational.singleton.Star;

public class Application {

    public static void main(String[] args) throws Exception {
        final Universe u = Universe.INSTANCE;
        u.add(new Star("Morgenstern"));
        u.add(new Star("Abendstern"));
        for (int i = 0; i < u.size(); i++) {
            System.out.println(u.get(i));
        }
    }
}

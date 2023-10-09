package creational.singleton.solution;

import creational.singleton.Star;

public class Application {

    public static void main(String[] args) throws Exception {
        final Universe u = Universe.getInstance();
        u.add(new Star("Morgenstern"));
        u.add(new Star("Abendstern"));
        for (int i = 0; i < u.size(); i++) {
            System.out.println(u.get(i));
        }

        System.out.println("----------------------------------");

        final Universe u2 = Universe.getInstance();
        System.out.println(u == u2);
        u2.add(new Star("Castor"));
        for (int i = 0; i < u2.size(); i++) {
            System.out.println(u2.get(i));
        }
    }
}

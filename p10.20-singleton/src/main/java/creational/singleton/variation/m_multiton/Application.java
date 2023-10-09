package creational.singleton.variation.m_multiton;

public class Application {

    public static void main(String[] args) throws Exception {
        final Universe u = Universe.INSTANCE;
        u.add(Star.getStar("Morgenstern"));
        u.add(Star.getStar("Abendstern"));
        for (int i = 0; i < u.size(); i++) {
            System.out.println(u.get(i));
        }
    }
}

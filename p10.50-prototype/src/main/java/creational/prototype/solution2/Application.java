package creational.prototype.solution2;

public class Application {

    public static void main(String[] args) throws Exception {
        final Preferences p0 = new Preferences("/preferences.properties");
        System.out.println(p0);

        final Preferences p1 = p0.clone();
        p1.setFontSize(20);
        System.out.println(p1);

        final Preferences p2 = p0.clone();
        p2.setBackground("grey");
        p2.setForeground("blue");
        System.out.println(p2);
    }
}

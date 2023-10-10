package creational.prototype.solution;

public class Application {

    public static void main(String[] args) throws Exception {
        final Preferences originalPrefs = new Preferences("/preferences.properties");
        System.out.println(originalPrefs);

        final Preferences p1 = originalPrefs.clone();
        p1.setFontSize(20);
        System.out.println(p1);

        final Preferences p2 = originalPrefs.clone();
        p2.setBackground("grey");
        p2.setForeground("blue");
        System.out.println(p2);
    }
}

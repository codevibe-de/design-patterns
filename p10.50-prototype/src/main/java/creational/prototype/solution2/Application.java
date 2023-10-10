package creational.prototype.solution2;

public class Application {

    public static void main(String[] args) throws Exception {
        final Preferences originalPrefs = new Preferences("/preferences.properties");
        System.out.println(originalPrefs);

        final Preferences p1 = originalPrefs.clone();
        p1.setFontSize(20);
        System.out.println(p1);

        final Preferences p2 = new Preferences(originalPrefs); // alternatively direct copy-constructor call
        p2.setBackground("grey");
        p2.setForeground("blue");
        System.out.println(p2);
    }
}

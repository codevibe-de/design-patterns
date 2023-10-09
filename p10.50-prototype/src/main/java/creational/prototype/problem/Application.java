package creational.prototype.problem;

import java.io.FileInputStream;
import java.util.Properties;


public class Application {

    public static void main(String[] args) throws Exception {
        // create original set of preferences by loading properties
        final Preferences p1 = new Preferences("/preferences.properties");
        System.out.println(p1);

        // make a copy with some customization
        final Preferences p2 = new Preferences();
        p2.setBackground(p1.getBackground());
        p2.setForeground("gray");
        p2.setFontName(p1.getFontName());
        p2.setFontSize(p1.getFontSize());
        System.out.println(p2);
    }
}

package template_method.problem;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Application1 {

    public static void main(String[] args) {
        final String filename = "src/appl/Application1.java";
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(filename))) {
            int ch = reader.read();
            System.out.println("Jetzt geht's los");
            while (ch != -1) {
                System.out.print((char) ch);
                ch = reader.read();
            }
            System.out.println("Das war's dann");
        } catch (final Exception e) {
            System.err.println(e);
        }
    }
}

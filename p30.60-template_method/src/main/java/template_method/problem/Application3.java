package template_method.problem;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Application3 {

    public static void main(String[] args) {
        final String filename = "src/appl/Application1.java";

        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(filename))) {
            int ch = reader.read();
            int count = 0;
            while (ch != -1) {
                if (ch == '\n') {
                    count++;
                }
                ch = reader.read();
            }
            System.out.println(count + " characters");
        } catch (final Exception e) {
            System.err.println(e);
        }
    }
}

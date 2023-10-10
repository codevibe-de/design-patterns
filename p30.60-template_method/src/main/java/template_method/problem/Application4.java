package template_method.problem;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Application4 {

    public static void main(String[] args) {
        final String filename = "src/appl/Application1.java";
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(filename))) {
            int ch = reader.read();
            int count = 0;
            boolean inWord = false;
            while (ch != -1) {
                if (!inWord && !Character.isWhitespace(ch)) {
                    count++;
                    inWord = true;
                } else if (inWord && Character.isWhitespace(ch)) {
                    inWord = false;
                }
                ch = reader.read();
            }
            System.out.println(count + " words");
        } catch (final Exception e) {
            System.err.println(e);
        }
    }
}

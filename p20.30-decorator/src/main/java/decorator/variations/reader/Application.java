package decorator.variations.reader;

import java.io.*;

public class Application {

    public static void main(String[] args) throws IOException {
        demo1();
        System.out.println("----------------------------------------");
        demo2();
    }

    static void demo1() throws IOException {
        final InputStream is1 = Application.class.getResourceAsStream("/numbers.txt");
        final Reader r1 = new InputStreamReader(is1);
        final BufferedReader br1 = new BufferedReader(r1);
        System.out.println(br1.readLine());
    }

    static void demo1b() throws IOException {
        final InputStream is1 = Application.class.getResourceAsStream("/numbers.txt");
        final InputStream is2 = new ByteArrayInputStream(new byte[]{65, 66, 67});

        final Reader r1 = new InputStreamReader(is1);
        final Reader r2 = new InputStreamReader(is2);
        final Reader r3 = new StringReader("hello");

        final BufferedReader br1 = new BufferedReader(r1);
        final BufferedReader br2 = new BufferedReader(r2);
        final BufferedReader br3 = new BufferedReader(r3);

        System.out.println(br1.readLine());
        System.out.println(br2.readLine());
        System.out.println(br3.readLine());
        System.out.println(br1 instanceof Reader);
    }

    static void demo2() throws IOException {
        final Reader reader = new StringReader(" 123 45     3.14159265  ");
        final NumberReader numberReader = new NumberReader(reader);

        Number number;
        while ((number = numberReader.readNumber()) != null) {
            System.out.println(number + " (" + number.getClass().getSimpleName() + ")");
        }
    }
}

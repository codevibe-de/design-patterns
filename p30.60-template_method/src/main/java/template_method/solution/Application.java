package template_method.solution;

public class Application {

    public static void main(String[] args) {
        final String filename = "src/appl/Application.java";

        new PrintProcessor().run(filename);

        final CharCountProcessor ccp = new CharCountProcessor();
        ccp.run(filename);
        System.out.println(ccp.getCount() + " characters");

        final LineCountProcessor lcp = new LineCountProcessor();
        lcp.run(filename);
        System.out.println(lcp.getCount() + " lines");
    }
}

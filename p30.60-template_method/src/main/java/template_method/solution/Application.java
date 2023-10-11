package template_method.solution;

public class Application {

    public static final String RESOURCE_NAME = "/data.txt";

    // NOTE there is (intentionally) a bug in the FileProcessor class -- see EXERCISE.md
    public static void main(String[] args) {
        new PrintProcessor().run(RESOURCE_NAME);

        final CharCountProcessor ccp = new CharCountProcessor();
        ccp.run(RESOURCE_NAME);
        System.out.println(ccp.getCount() + " characters");

        final LineCountProcessor lcp = new LineCountProcessor();
        lcp.run(RESOURCE_NAME);
        System.out.println(lcp.getCount() + " lines");
    }
}

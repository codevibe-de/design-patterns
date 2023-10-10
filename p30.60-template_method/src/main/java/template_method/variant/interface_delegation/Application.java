package template_method.variant.interface_delegation;

public class Application {

    public static void main(String[] args) {
        final String filename = "src/appl/Application.java";

        final FileProcessor fp = new FileProcessor();

        fp.run(filename, new PrintProcessor());

        final CharCountProcessor ccp = new CharCountProcessor();
        fp.run(filename, ccp);
        System.out.println(ccp.getCount() + " characters");

        final LineCountProcessor lcp = new LineCountProcessor();
        fp.run(filename, lcp);
        System.out.println(lcp.getCount() + " lines");
    }
}

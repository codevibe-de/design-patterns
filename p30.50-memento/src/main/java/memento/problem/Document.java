package memento.problem;

import java.util.ArrayList;
import java.util.List;

public class Document {

    public static interface Element {
        void display();
    }

    public static class TextElement implements Element {
        private final StringBuilder builder = new StringBuilder();

        public TextElement(String s) {
            this.builder.append(s);
        }

        public void append(String s) {
            this.builder.append(s);
        }

        public void remove(int startIndex, int length) {
            this.builder.delete(startIndex, startIndex + length);
        }

        @Override
        public void display() {
            System.out.println(this.builder);
        }
    }

    public static class FontElement implements Element {
        private String fontname;
        private int fontsize;

        public FontElement(String fontname, int fontsize) {
            this.fontname = fontname;
            this.fontsize = fontsize;
        }

        public String getFontname() {
            return this.fontname;
        }

        public void setFontname(String fontname) {
            this.fontname = fontname;
        }

        public int getFontsize() {
            return this.fontsize;
        }

        public void setFontsize(int fontsize) {
            this.fontsize = fontsize;
        }

        @Override
        public void display() {
            System.out.println("[" + this.fontname + " " + this.fontsize + "]");
        }
    }

    private final List<Element> elements = new ArrayList<>();

    public void append(Element element) {
        this.elements.add(element);
    }

    public void remove(int index) {
        this.elements.remove(index);
    }

    public int size() {
        return this.elements.size();
    }

    public Element get(int index) {
        return this.elements.get(index);
    }

    public void display() {
        for (final Element element : this.elements) {
            element.display();
        }
    }
}

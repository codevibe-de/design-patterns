package creational.prototype.solution2;

import java.io.IOException;
import java.util.Properties;

public class Preferences implements Cloneable {

    private String background;
    private String foreground;
    private String fontName;
    private int fontSize;

    public Preferences() {
    }

    public Preferences(String resourcePath) throws IOException {
        final Properties props = new Properties();
        props.load(getClass().getResourceAsStream(resourcePath));
        this.background = props.getProperty("background");
        this.foreground = props.getProperty("foreground");
        this.fontName = props.getProperty("fontName");
        this.fontSize = Integer.parseInt(props.getProperty("fontSize"));
    }

    public Preferences(Preferences original) {
        this.background = original.getBackground();
        this.foreground = original.getForeground();
        this.fontName = original.getFontName();
        this.fontSize = original.getFontSize();
    }

    @Override
    public Preferences clone() {
        return new Preferences(this);
    }

    public String getBackground() {
        return this.background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getForeground() {
        return this.foreground;
    }

    public void setForeground(String foreground) {
        this.foreground = foreground;
    }

    public String getFontName() {
        return this.fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public int getFontSize() {
        return this.fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    @Override
    public String toString() {
        return "Preferences [background=" + this.background + ", foreground=" + this.foreground
                + ", fontName=" + this.fontName + ", fontSize=" + this.fontSize + "]";
    }

}

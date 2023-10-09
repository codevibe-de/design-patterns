package creational.singleton;

public class Star {

    public final String name;

    public Star(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Star [name=" + this.name + "]";
    }

}

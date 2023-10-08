package creational.factory_method;

public class Letter implements Container {

    private final String contents;
    private final float postage;

    public Letter(String contents, float postage) {
        this.contents = contents;
        this.postage = postage;
    }

    @Override
    public String getContents() {
        return this.contents;
    }

    @Override
    public float getPostage() {
        return this.postage;
    }
}

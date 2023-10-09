package creational.builder_complex.solution;

public class Application {

    public static void main(String[] args) throws Exception {
        Shape shape = new Shape.Builder()
                .add(1, 2)
                .build();
        System.out.println(shape);

        shape = new Shape.Builder()
                .add(1, 2)
                .add(20, 33)
                .build();
        System.out.println(shape);

        shape = new Shape.Builder()
                .add(1, 2)
                .add(20, 33)
                .add(21, 33)
                .add(20, 323)
                .build();
        System.out.println(shape);
    }
}

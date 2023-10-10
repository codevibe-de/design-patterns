package iterator.variation.b_internal;

import java.util.function.Consumer;

public class Application {

    public static void main(String[] args) {
        final SimpleArrayList<String> l1 = new SimpleArrayList<>();
        l1.add("spring");
        l1.add("summer");
        l1.add("autumn");
        l1.add("winter");
        l1.forEach(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        });
        l1.forEach(value -> System.out.println(value));
        l1.forEach(System.out::println);

        final SimpleLinkedList<String> l2 = new SimpleLinkedList<>();
        l2.add("spring");
        l2.add("summer");
        l2.add("autumn");
        l2.add("winter");
        l2.forEach(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        });
        l2.forEach(value -> System.out.println(value));
        l2.forEach(System.out::println);
    }
}

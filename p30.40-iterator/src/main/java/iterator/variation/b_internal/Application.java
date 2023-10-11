package iterator.variation.b_internal;

import java.util.function.Consumer;

@SuppressWarnings({"Convert2Lambda", "Convert2MethodRef"})
public class Application {

    public static void main(String[] args) {
        final SimpleArrayList<String> list1 = new SimpleArrayList<>();
        list1.add("spring");
        list1.add("summer");
        list1.add("autumn");
        list1.add("winter");
        list1.forEach(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        });
        list1.forEach(value -> System.out.println(value));
        list1.forEach(System.out::println);

        final SimpleLinkedList<String> list2 = new SimpleLinkedList<>();
        list2.add("spring");
        list2.add("summer");
        list2.add("autumn");
        list2.add("winter");
        list2.forEach(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        });
        list2.forEach(value -> System.out.println(value));
        list2.forEach(System.out::println);
    }
}

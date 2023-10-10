package iterator.solution;

import java.util.Iterator;


public class Application {

    public static void main(String[] args) throws Exception {
        final SimpleArrayList<String> l1 = new SimpleArrayList<>();
        l1.add("spring");
        l1.add("summer");
        l1.add("autumn");
        l1.add("winter");
        print(l1.iterator());

        final SimpleLinkedList<String> l2 = new SimpleLinkedList<>();
        l2.add("spring");
        l2.add("summer");
        l2.add("autumn");
        l2.add("winter");
        print(l2.iterator());
    }

    private static <T> void print(Iterator<T> iter) {
        while (iter.hasNext()) {
            final T value = iter.next();
            System.out.println(value);
        }
    }
}

package iterator.variation.a_iterable;

import java.util.Iterator;


public class Application {

    public static void main(String[] args) throws Exception {
        final SimpleArrayList<String> l1 = new SimpleArrayList<>();
        l1.add("spring");
        l1.add("summer");
        l1.add("autumn");
        l1.add("winter");
        printA(l1);
        printB(l1);

        final SimpleLinkedList<String> l2 = new SimpleLinkedList<>();
        l2.add("spring");
        l2.add("summer");
        l2.add("autumn");
        l2.add("winter");
        printA(l2);
        printB(l1);
    }

    private static <T> void printA(Iterable<T> iterable) {
        final Iterator<T> iter = iterable.iterator();
        while (iter.hasNext()) {
            final T value = iter.next();
            System.out.println(value);
        }
    }

    private static <T> void printB(Iterable<T> iterable) {
        for (final T value : iterable) {
            System.out.println(value);
        }
    }
}

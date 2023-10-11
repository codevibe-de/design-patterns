package iterator.variation.a_iterable;

import java.util.Iterator;


public class Application {

    public static void main(String[] args) throws Exception {
        final SimpleArrayList<String> list1 = new SimpleArrayList<>();
        list1.add("spring");
        list1.add("summer");
        list1.add("autumn");
        list1.add("winter");
        printUsingIterator(list1);
        printUsingForeach(list1);

        final SimpleLinkedList<String> list2 = new SimpleLinkedList<>();
        list2.add("spring");
        list2.add("summer");
        list2.add("autumn");
        list2.add("winter");
        printUsingIterator(list2);
        printUsingForeach(list1);
    }

    private static <T> void printUsingIterator(Iterable<T> iterable) {
        final Iterator<T> iter = iterable.iterator();
        while (iter.hasNext()) {
            final T value = iter.next();
            System.out.println(value);
        }
    }

    private static <T> void printUsingForeach(Iterable<T> iterable) {
        for (final T value : iterable) {
            System.out.println(value);
        }
    }
}

package iterator.solution;

import java.util.Iterator;


public class Application {

    public static void main(String[] args) throws Exception {
        final SimpleArrayList<String> list1 = new SimpleArrayList<>();
        list1.add("spring");
        list1.add("summer");
        list1.add("autumn");
        list1.add("winter");
        print(list1.iterator());

        final SimpleLinkedList<String> list2 = new SimpleLinkedList<>();
        list2.add("spring");
        list2.add("summer");
        list2.add("autumn");
        list2.add("winter");
        print(list2.iterator());
    }

    private static <T> void print(Iterator<T> iter) {
        while (iter.hasNext()) {
            final T value = iter.next();
            System.out.println(value);
        }
    }
}

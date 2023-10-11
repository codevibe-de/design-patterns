package iterator.problem;

public class Application {

    public static void main(String[] args) throws Exception {
        // create an array-based list
        final SimpleArrayList<String> list1 = new SimpleArrayList<>();
        list1.add("spring");
        list1.add("summer");
        list1.add("autumn");
        list1.add("winter");
        // loop over list1 using a very old fashioned for() loop
        for (int i = 0; i < list1.size(); i++) {
            final String s = list1.get(i);
            System.out.println(s);
        }

        // create a link-based list1
        final SimpleLinkedList<String> list2 = new SimpleLinkedList<>();
        list2.add("spring");
        list2.add("summer");
        list2.add("autumn");
        list2.add("winter");
        // loop over nodes in list1
        for (SimpleLinkedList.Node<String> node = list2.getFirst(); node != null; node = node.getNext()) {
            final String s = node.getValue();
            System.out.println(s);
        }
    }
}

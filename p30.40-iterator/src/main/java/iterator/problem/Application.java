package iterator.problem;

public class Application {

    public static void main(String[] args) throws Exception {
        final SimpleArrayList<String> l1 = new SimpleArrayList<>();
        l1.add("spring");
        l1.add("summer");
        l1.add("autumn");
        l1.add("winter");
        for (int i = 0; i < l1.size(); i++) {
            final String s = l1.get(i);
            System.out.println(s);
        }
        final SimpleLinkedList<String> l2 = new SimpleLinkedList<>();
        l2.add("spring");
        l2.add("summer");
        l2.add("autumn");
        l2.add("winter");
        for (SimpleLinkedList.Node<String> node = l2.getFirst(); node != null; node = node.getNext()) {
            final String s = node.getValue();
            System.out.println(s);
        }
    }
}

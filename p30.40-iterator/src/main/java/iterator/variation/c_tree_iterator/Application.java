package iterator.variation.c_tree_iterator;

public class Application {

    public static void main(String[] args) throws Exception {
        final Node<Integer> root = new Node<Integer>(50);
        root.add(30);
        root.add(20);
        root.add(40);
        root.add(10);
        root.add(80);
        root.add(70);
        root.add(90);
        root.add(60);
        root.foreach(System.out::println);
    }
}

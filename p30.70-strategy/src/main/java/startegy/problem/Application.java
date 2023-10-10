package startegy.problem;

public class Application {

    public static void main(String[] args) {
        final SimpleArrayList<String> list = new SimpleArrayList<>();
        list.add("spring");
        list.add("summer");
        list.add("autumn");
        list.add("winter");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}

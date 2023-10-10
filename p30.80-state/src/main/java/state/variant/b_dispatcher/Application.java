package state.variant.b_dispatcher;

public class Application {
    public static void main(String[] args) {
        final MyContext context = new MyContext();
        context.dispatch(new EventA(4711));
        context.dispatch(new EventA(4712));
        context.dispatch(new EventB("Hello"));
        context.dispatch(new EventA(4713));
        try {
            context.dispatch(new EventB("World"));
        } catch (final Exception e) {
            System.out.println(e);
        }
        context.dispatch(new EventA(4714));
    }
}

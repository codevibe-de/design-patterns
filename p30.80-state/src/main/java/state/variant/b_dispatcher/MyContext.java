package state.variant.b_dispatcher;

import java.util.function.Function;

public class MyContext {

    private class StateX extends State {
        public StateX() {
            super("StateX");
            this.register(EventA.class, new Function<EventA, State>() {
                @Override
                public State apply(EventA e) {
                    System.out.println("\t" + StateX.this.name + " : Processing EventA : " + e.a);
                    return MyContext.this.stateY;
                }
            });
            this.register(EventB.class, e -> {
                System.out.println("\t" + this.name + " : Processing EventB : " + e.b);
                return MyContext.this.stateX;
            });
        }
    }

    private class StateY extends State {
        public StateY() {
            super("StateY");
            this.register(EventA.class, e -> {
                System.out.println("\t" + this.name + ": Processing EventA : " + e.a);
                return MyContext.this.stateX;
            });
        }
    }

    private final StateX stateX = new StateX();
    ;
    private final StateY stateY = new StateY();
    ;

    private State currentState = this.stateX;

    public void dispatch(Event e) {
        this.currentState = this.currentState.dispatch(e);
    }
}

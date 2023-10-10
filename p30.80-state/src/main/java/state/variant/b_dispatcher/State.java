package state.variant.b_dispatcher;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public abstract class State {

    public final String name;

    public State(String name) {
        this.name = name;
    }

    private final Map<Class<? extends Event>, Function<? extends Event, State>> functions = new HashMap<>();

    public <T extends Event> void register(Class<T> eventType, Function<T, State> function) {
        this.functions.put(eventType, function);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public State dispatch(Event e) {
        final Function<? extends Event, State> function = this.functions.get(e.getClass());
        if (function == null) {
            System.out.printf("Cannot dispatch. Current State = %s, Event = %s\n", this.name, e.getClass().getSimpleName());
            return this;
        }
        final State newState = (State) ((Function) function).apply(e);
        System.out.printf("%s ==> %s\n", this.name, newState.name);
        return newState;
    }
}

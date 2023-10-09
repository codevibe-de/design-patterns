package creational.abstract_factory.solution;


public class Configuration {

    public static ComponentFactory getComponentFactory(ComponentType componentType) {
        return switch (componentType) {
            case SIMPLE -> new SimpleComponentFactory();
            case DEFAULT -> new DefaultComponentFactory();
            case OVERDRESSED -> new OverdressedComponentFactory();
        };
    }

}
